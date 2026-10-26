package Demo_4;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

public class TCPEchoClient {
    static void main() {
        try {
            Socket clientSocket = new Socket("localhost",1234);
            BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader((new InputStreamReader(clientSocket.getInputStream())));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            String message;
            while(true){
                System.out.println("Send to server: ");
                message = user.readLine();
                if (message.length() == 0)
                    break;
                out.println(message);
                out.flush();
                String reply;
                reply= in.readLine();
                System.out.println("Reply from Server: " + reply );
            }
            clientSocket.close();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
