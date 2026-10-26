package Demo_7;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientChatter extends JFrame {
    private JPanel panel1;
    private JTextField txtStaff;
    private JTextField txtServerIP;
    private JTextField txtServerPort;
    private JButton btnConnect;

    Socket mngSocket = null;
    String mngIP = "";
    int mngPort = 0;
    String staffName = "";
    BufferedReader bf = null;
    DataOutputStream os = null;

    public ClientChatter() {
        this.setContentPane(panel1);
        this.setTitle("Client Chatter - Đăng nhập");
        this.setSize(650, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        txtServerIP.setText("127.0.0.1");
        txtServerPort.setText("12345");
        txtStaff.setText("Staff_01");

        btnConnect.addActionListener(evt -> btnConnectActionPerformed(evt));
    }

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            mngIP = this.txtServerIP.getText().trim();
            mngPort = Integer.parseInt(this.txtServerPort.getText().trim());
            staffName = this.txtStaff.getText().trim();

            if (staffName.isEmpty() || mngIP.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
                return;
            }

            mngSocket = new Socket(mngIP, mngPort);
            if (mngSocket != null) {
                ChatPanel p = new ChatPanel(mngSocket, staffName, "Manager");

                JFrame chatFrame = new JFrame("Chat Room - " + staffName);
                chatFrame.setContentPane(p);
                chatFrame.setSize(500, 400);
                chatFrame.setLocationRelativeTo(null);
                chatFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                chatFrame.setVisible(true);

                p.getTxtMessages().append("Connected to Manager successfully!\n");

                os = new DataOutputStream(mngSocket.getOutputStream());
                os.writeBytes("Staff: " + staffName);
                os.write(13);
                os.write(10);
                os.flush();

                this.dispose();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Không thể kết nối tới Manager Server!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ClientChatter().setVisible(true);
        });
    }
}
