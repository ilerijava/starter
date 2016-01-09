package hafta5.gun1;

import javax.swing.JOptionPane;

public class InputDialog {

    public static void main(String[] args) {

        String deger = JOptionPane.showInputDialog("Lütfen bir değer giriniz");
        JOptionPane.showMessageDialog(null, "Girdiğiniz değer : " + deger);

        Object[] evetHayir = {1, 2, 3};
        Object sayi = JOptionPane.showInputDialog(null, "Lütfen bir sayı giriniz",
                "Değer Giriniz", JOptionPane.ERROR_MESSAGE, null, evetHayir, 0);
        JOptionPane.showMessageDialog(null, "Girdiğiniz sayı : " + sayi);
    }

}
