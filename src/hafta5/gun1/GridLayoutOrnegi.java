package hafta5.gun1;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class GridLayoutOrnegi extends JFrame{
    
    public GridLayoutOrnegi(){
        GridLayout gridLayout = new GridLayout(2, 2, 3, 4);
        setLayout(gridLayout);
        
        
        JLabel label1 = new JLabel("Ad : ");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Şifre");
        JPasswordField field2 = new JPasswordField(10);
                
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setTitle("Grid Layout Örneği");
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new GridLayoutOrnegi();
    }
}
