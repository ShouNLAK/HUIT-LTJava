package Bai_3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MayTinhServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6000);
        System.out.println("May tinh dang cho o cong 6000...");
        int dem = 0;
        try {
            while (true) {
                Socket socket = server.accept();
                dem++;
                System.out.println("Client " + dem + " ket noi");
                new Thread(new XuLyClient(socket), "client-" + dem).start();
            }
        } finally {
            server.close();
        }
    }
}
