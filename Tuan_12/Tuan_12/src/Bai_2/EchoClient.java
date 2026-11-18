package Bai_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;

public class EchoClient {
    static void main() throws IOException {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 5000);
        } catch (ConnectException e) {
            System.out.println("Chưa chạy server");
            return;
        }
        BufferedReader serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Nhập : ");
            String nhap = keyboard.readLine();
            out.println(nhap);
            if (nhap.equals("bye") || nhap.equals("Tam biet")) {
                break;
            }
            String traLoi = serverIn.readLine();
            System.out.println("Nhận : " + traLoi);
        }
        socket.close();
        System.out.println("Client kết thúc");
    }
}
