package Demo_7;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatPanel extends JPanel {
    private JPanel panel1;
    private JTextArea txtMessage;
    private JButton btnSend;
    private JTextArea txtMessages;

    Socket socket = null;
    BufferedReader bf = null;
    DataOutputStream os = null;
    OutputThread t = null;
    String sender;
    String receiver;

    public ChatPanel(Socket s, String sender, String receiver) throws IOException {
        socket = s;
        this.sender = sender;
        this.receiver = receiver;

        this.setLayout(new BorderLayout());
        this.add(panel1, BorderLayout.CENTER);

        try {
            bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            os = new DataOutputStream(socket.getOutputStream());
            t = new OutputThread(s,txtMessages, sender, receiver);
            t.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        btnSend.addActionListener(evt -> btnSendActionPerformed(evt));
    }

    public JTextArea getTxtMessages(){
        return this.txtMessages;
    }

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt){
        if (txtMessage.getText().trim().length() == 0) return;
        try {
            os.writeBytes((txtMessage.getText()));
            os.write(13);
            os.write(10);
            os.flush();
            this.txtMessages.append("\n" + sender +": " +txtMessage.getText());
            txtMessage.setText("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
