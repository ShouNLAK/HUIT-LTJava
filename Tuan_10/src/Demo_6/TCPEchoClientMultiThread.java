package Demo_6;

import java.io.*;
import java.net.Socket;

public class TCPEchoClientMultiThread implements Runnable {
    private String clientName;

    public TCPEchoClientMultiThread(String name) {
        this.clientName = name;
    }

    @Override
    public void run() {
        try {
            Socket socket = new Socket("localhost", 1234);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

            System.out.println("[" + clientName + "] Connected. Type messages (empty line to quit):");

            while (true) {
                System.out.print("[" + clientName + "] Message: ");
                String message = userInput.readLine();
                if (message == null || message.length() == 0) {
                    break;
                }

                out.println(clientName + ": " + message);
                out.flush();

                String response = in.readLine();
                System.out.println("[" + clientName + "] Echo from server: " + response);
            }

            socket.close();
        } catch (IOException e) {
            System.out.println("[" + clientName + "] Cannot connect to server!");
        }
    }

    public static void main(String[] args) {
        Thread c = new Thread(new TCPEchoClientMultiThread(Thread.currentThread().getName()));
        c.start();
    }
}