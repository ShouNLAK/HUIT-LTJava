package Demo_6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServerMultiThread {
    public static final int DEFAULT_PORT = 1234;

    public static void main(String[] args) {
        try {
            ServerSocket servSocket = new ServerSocket(DEFAULT_PORT);
            System.out.println("Server waiting on port: " + DEFAULT_PORT);

            while (true) {
                Socket clientSocket = servSocket.accept();
                Runnable t = new TCPEchoThread(clientSocket);
                new Thread(t).start();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}