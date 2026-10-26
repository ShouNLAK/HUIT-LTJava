package Demo_4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
    public static final int DEFAULT_PORT = 1234;

    static void main() {
        try {
            ServerSocket servSocket = new ServerSocket(DEFAULT_PORT);
            System.out.println("Server is waiting for port: " + DEFAULT_PORT);
            while(true){
                Socket connSocket = servSocket.accept();
                System.out.println("Accepted client: " + connSocket.getInetAddress().getHostAddress());
                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(connSocket.getInputStream()));
                    PrintWriter out = new PrintWriter(new OutputStreamWriter(connSocket.getOutputStream()));
                    String message;
                    while((message = in.readLine()) != null){
                        System.out.println("Received from client: " + message);
                        out.println(message);
                        out.flush();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
