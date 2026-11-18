package Bai_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    static void main() throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server đang mở cổng 5000");
        Socket socket = server.accept();
        System.out.println("Client kết nối: " + socket.getInetAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        String dong;
        while ((dong = in.readLine()) != null){
            if (dong == "bye" || dong == "Tam biet")
                break;
            System.out.println("Nhắn : " + dong);
            out.println(dong.toUpperCase());
        }
        socket.close();
        server.close();
        System.out.println("Server kết thúc");
    }
}
