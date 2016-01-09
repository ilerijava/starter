package hafta5.gun1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FlowLayoutOrnegi extends JFrame {

    public FlowLayoutOrnegi() {

        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 3, 4);
        setLayout(flowLayout);

        JLabel label1 = new JLabel("Ad : ");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Şifre : ");
        JPasswordField field2 = new JPasswordField(10);

        add(label1);
        add(field1);
        add(label2);
        add(field2);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Flow Layout Örneği");
    }

    public static void main(String[] args) {
        FlowLayoutOrnegi flo = new FlowLayoutOrnegi();
        flo.setVisible(true);
    }
}
