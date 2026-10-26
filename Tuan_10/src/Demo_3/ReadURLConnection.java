package Demo_3;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ReadURLConnection extends JFrame {
    private JTextField txtURL;
    private JButton btnConnect;
    private JTextArea txtContent;

    public ReadURLConnection() {
        initComponents();
        this.setTitle("Demo 2: Read a URL");
        this.setSize(450, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        this.setLayout(new BorderLayout());

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel jLabel1 = new JLabel("URL:");
        txtURL = new JTextField();
        txtURL.setPreferredSize(new Dimension(300, 30));

        btnConnect = new JButton("Connect");
        btnConnect.addActionListener(evt -> btnConnectActionPerformed(evt));

        jPanel1.add(jLabel1);
        jPanel1.add(txtURL);
        jPanel1.add(btnConnect);

        txtContent = new JTextArea();
        JScrollPane jScrollPane1 = new JScrollPane(txtContent);

        this.add(jPanel1, BorderLayout.NORTH);
        this.add(jScrollPane1, BorderLayout.CENTER);
    }

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            String urlTarget = txtURL.getText().trim();
            this.txtContent.setText(readContent(urlTarget));
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "Lỗi kết nối: " + e.getMessage());
        }
    }

    private String readContent(String urlString) throws Exception {
        String content = "";
        URL url = new URL(urlString);
        URLConnection con = url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream())
        );
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            content += inputLine + "\n";
        }
        in.close();
        return content;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReadURLConnection form = new ReadURLConnection();
            form.txtURL.setText("https://google.com");
            form.setVisible(true);
        });
    }
}
