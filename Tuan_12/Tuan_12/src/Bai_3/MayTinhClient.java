package Bai_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;

public class MayTinhClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 6000);
             BufferedReader serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Nhap bieu thuc, go bye de thoat > ");
                String nhap = keyboard.readLine();
                if (nhap == null) {
                    break;
                }
                out.println(nhap);
                String traLoi = serverIn.readLine();
                if (traLoi == null) {
                    break;
                }
                System.out.println(traLoi);
                if ("bye".equalsIgnoreCase(nhap.trim())) {
                    break;
                }
            }
        } catch (ConnectException e) {
            System.out.println("Chua chay server!");
        }
    }
}
