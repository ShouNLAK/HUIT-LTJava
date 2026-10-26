package Demo_5;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StudentServer {
    public static final int DEFAULT_PORT = 1234;

    private static void communicate(Socket connSocket) {
        try {
            ObjectInputStream in = new ObjectInputStream(connSocket.getInputStream());
            Student student;
            try {
                while ((student = (Student) in.readObject()) != null) {
                    System.out.println("Received: " + student.getId() + " - " + student.getName());
                }
            } catch (ClassNotFoundException e) {
                System.out.println("Invalid data from Client!");
            } catch (IOException e) {
                System.out.println("Client stopped sending data!");
            }
        } catch (IOException e) {
            System.out.println("Cannot communicate to Client!");
        }
    }

    public static void main(String[] args) {
        try {
            ServerSocket servSocket = new ServerSocket(DEFAULT_PORT);
            System.out.println("Server waiting on port: " + DEFAULT_PORT);
            while (true) {
                Socket connSocket = servSocket.accept();
                communicate(connSocket);
            }
        } catch (IOException e) {
            System.out.println("Cannot start server on port " + DEFAULT_PORT);
        }
    }
}