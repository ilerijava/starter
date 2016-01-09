package hafta5.gun1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 3, 6));
        panel.setForeground(Color.red);
        panel.setBackground(Color.white);
        panel.setOpaque(true);
        JLabel label1 = new JLabel("Kullanıcı Adı : ");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Şifre : ");
        JPasswordField field2 = new JPasswordField(10);
        JButton button = new JButton("Giriş Yap");
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(new JLabel());
        panel.add(button);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String kullaniciAdi = field1.getText();
                char[] password = field2.getPassword();
                String sifre = new String(password);

                if (kullaniciAdi.equals("admin") && sifre.equals("123456")) {
                    JOptionPane.showMessageDialog(null, "Kullanıcı Girişi Başarılı");
                } else {
                    JOptionPane.showMessageDialog(null, "Yanlış kullanıcı adı veya şifre");
                }
            }
        };

        button.addActionListener(al);

        add(panel);
        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);
        setTitle("Login Ekranı");
    }

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }

}
