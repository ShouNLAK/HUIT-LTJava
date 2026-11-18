package Bai_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SuDung {
    static void main() throws IOException {
        String diachi;
        URL url = null;
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Nhập URL: ");
            diachi = input.nextLine();
            url = new URL(diachi);
        } catch (MalformedURLException e) {
            System.out.println("In URL sai dinh dang");
        }

        try {
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            for (int i = 1; i <= 5; i++) {
                String line = in.readLine();
                if (line == null)
                    break;
                System.out.println(line);
            }

            in.close();
        } catch (IOException e) {
            System.out.println("Không đọc được trang : " + url);
        }

        input.close();
    }
}
