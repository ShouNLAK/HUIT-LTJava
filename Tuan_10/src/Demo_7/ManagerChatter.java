package Demo_7;

import Demo_2.UI_ReadURL;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ManagerChatter extends JFrame implements Runnable {
    private JTextField txtServerPort;
    private JTabbedPane tabbedPane1;
    private JLabel lbMessage;
    private JPanel panel1;

    ServerSocket srvSocket = null;
    BufferedReader br = null;
    Thread t;

    public ManagerChatter() {
        this.setTitle("Manager Chatter - Server");
        this.setSize(600, 450);
        this.setContentPane(panel1);
        txtServerPort.setText("12345");
        try {
            int serverPort = Integer.parseInt(txtServerPort.getText().trim());
            srvSocket = new ServerSocket(serverPort);
            this.lbMessage.setText("Mng. Server is running at port: " + serverPort);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khởi động Server: " + e.getMessage());
            throw new RuntimeException(e);
        }

        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (srvSocket == null) break;
                Socket aStaffSocket = srvSocket.accept();
                if (aStaffSocket != null) {
                    br = new BufferedReader(new InputStreamReader(aStaffSocket.getInputStream()));
                    String S = br.readLine();
                    String staffName = "Staff";
                    if (S != null && S.contains(":")) {
                        int pos = S.indexOf(":");
                        staffName = S.substring(pos + 1).trim();
                    }

                    final String finalStaffName = staffName;
                    SwingUtilities.invokeLater(() -> {
                        try {
                            ChatPanel p = new ChatPanel(aStaffSocket, "Manager", finalStaffName);
                            tabbedPane1.addTab(finalStaffName, p);
                            p.getTxtMessages().append("Connected with staff: " + finalStaffName + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                }
            } catch (IOException e) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ManagerChatter().setVisible(true);
        });
    }
}
