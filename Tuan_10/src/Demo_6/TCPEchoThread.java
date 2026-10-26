package Demo_6;

import java.io.*;
import java.net.Socket;

public class TCPEchoThread implements Runnable {
    private Socket socket;

    public TCPEchoThread(Socket s) {
        socket = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream()));

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Receive from client: " + message);
                out.println(message);
                out.flush();
            }

            System.out.println("Client has stopped sending data!");
            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}