package Bai_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class XuLyClient implements Runnable {
    private final Socket socket;

    public XuLyClient(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (Socket client = socket;
             BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
             PrintWriter out = new PrintWriter(client.getOutputStream(), true)) {
            String dong;
            while ((dong = in.readLine()) != null) {
                System.out.println("[" + Thread.currentThread().getName() + "] " + dong);
                if ("bye".equalsIgnoreCase(dong.trim())) {
                    out.println("Tam biet");
                    break;
                }
                out.println(tinh(dong));
            }
        } catch (IOException e) {
            System.out.println("Loi ket noi voi " + Thread.currentThread().getName() + ": " + e.getMessage());
        }
    }

    public static String tinh(String bieuThuc) {
        String[] phan = bieuThuc.trim().split("\\s+");
        if (phan.length != 3) {
            return "Loi: nhap theo dang a + b";
        }

        double a;
        double b;
        try {
            a = Double.parseDouble(phan[0]);
            b = Double.parseDouble(phan[2]);
        } catch (NumberFormatException e) {
            return "Loi: a, b phai la so";
        }

        switch (phan[1]) {
            case "+":
                return "Ket qua: " + (a + b);
            case "-":
                return "Ket qua: " + (a - b);
            case "*":
                return "Ket qua: " + (a * b);
            case "/":
                if (b == 0) {
                    return "Loi: chia cho 0";
                }
                return "Ket qua: " + (a / b);
            default:
                return "Loi: phep tinh khong hop le";
        }
    }
}
