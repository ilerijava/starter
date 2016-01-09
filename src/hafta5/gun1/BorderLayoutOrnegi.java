package hafta5.gun1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BorderLayoutOrnegi extends JFrame {

    public BorderLayoutOrnegi() {

        BorderLayout borderLayout = new BorderLayout(5, 10);
        setLayout(borderLayout);

        JButton button1 = new JButton("NORTH1");
        JButton button2 = new JButton("EAST1");
        JButton button3 = new JButton("SOUTH1");
        JButton button4 = new JButton("WEST1");
        JButton button5 = new JButton("CENTER1");
        JPanel panel = new JPanel(new GridLayout(2, 2, 3, 6));
        panel.setForeground(Color.red);
        panel.setBackground(Color.white);
        panel.setOpaque(true);
        JLabel label1 = new JLabel("Ad : ");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Şifre");
        JPasswordField field2 = new JPasswordField(10);
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);

        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.EAST);
        add(button3, BorderLayout.SOUTH);
        add(button4, BorderLayout.WEST);
        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);
        setTitle("Border Layout Örneği");
    }

    public static void main(String[] args) {
        BorderLayoutOrnegi blo = new BorderLayoutOrnegi();
        blo.setVisible(true);
    }
}
