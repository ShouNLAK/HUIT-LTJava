package Demo_2;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class UI_ReadURL extends JFrame {
    private JPanel panel1;
    private JTextField txtURL;
    private JButton btnConnect;
    private JTextArea txtContent;

    public UI_ReadURL() {
        this.setContentPane(panel1);
        this.setTitle("Demo 2: Read a URL");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        btnConnect.addActionListener(evt -> btnConnectActionPerformed(evt));
    }

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            String urlTarget = txtURL.getText().trim();
            if (!urlTarget.startsWith("http://") && !urlTarget.startsWith("https://")) {
                urlTarget = "https://" + urlTarget;
                txtURL.setText(urlTarget);
            }

            this.txtContent.setText(readContent(urlTarget));
            this.txtContent.setCaretPosition(0); // Cuộn lên đầu văn bản sau khi tải xong
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "Lỗi kết nối: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String readContent(String urlString) throws Exception {
        StringBuilder content = new StringBuilder();
        URL url = new URL(urlString);
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine).append("\n");
            }
        }
        return content.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UI_ReadURL form = new UI_ReadURL();
            form.txtURL.setText("https://google.com");
            form.setVisible(true);
        });
    }
}
