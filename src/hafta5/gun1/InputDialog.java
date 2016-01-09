package hafta5.gun1;

import javax.swing.JOptionPane;

public class InputDialog {

    public static void main(String[] args) {
        /*
        Object[] evetHayir = {1, 2, 3};
        Object deger = JOptionPane.showInputDialog(null, "Lütfen bir sayı giriniz",
                "Değer Giriniz", JOptionPane.ERROR_MESSAGE, null, evetHayir, 0);
        System.out.println(deger);
        JOptionPane.showMessageDialog(null, "Girdiğiniz değer : " + deger);
         */
 /*
        int cevap = JOptionPane.showConfirmDialog(null, "Çıkmak istiyor musunuz?");
        if (cevap == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "EVET, ÇIKIŞ");
        } else if (cevap == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "HAYIR, ÇIKIŞ YOK");
        } else if (cevap == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "İPTAL");
        }
         */

        String[] str = {"EVET", "HAYIR", "İPTAL"};
        int cevap = JOptionPane.showOptionDialog(null, "İslem yapmak istiyor musunuz?", "İŞLEM",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, str, 1);
        if (cevap == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "EVET, ÇIKIŞ");
        } else if (cevap == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "HAYIR, ÇIKIŞ YOK");
        } else if (cevap == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "İPTAL");
        }

    }

}
