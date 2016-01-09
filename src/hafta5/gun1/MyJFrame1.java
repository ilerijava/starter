package hafta5.gun1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame1 extends JFrame {

    public MyJFrame1() {
        JLabel label = new JLabel();
        label.setBackground(Color.GREEN);
        label.setForeground(Color.BLUE);
        label.setText("Merhaba Java");
        label.setSize(130, 50);
        label.setOpaque(true);
        label.setToolTipText("Merhaba Java 2016");

        add(label);
        pack();
    }

    public static void main(String[] args) {
        MyJFrame1 frame1 = new MyJFrame1();
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setTitle("Java GUI");
        frame1.setSize(320, 202);
        frame1.setVisible(true);
    }
}
