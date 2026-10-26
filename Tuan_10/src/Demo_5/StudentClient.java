package Demo_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class StudentClient {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 1234);
            BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());

            while (true) {
                System.out.print("Student's ID: ");
                String id = user.readLine();
                if (id.length() == 0) {
                    System.out.println("Stopped sending data to server!");
                    break;
                }

                System.out.print("Student's name: ");
                String name = user.readLine();

                Student student = new Student(id, name);
                out.writeObject(student);
                out.flush();
            }

            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Cannot connect to server!");
        }
    }
}