package hafta5.gun1;

import javax.swing.JOptionPane;

public class ConfirmDialog {

    public static void main(String[] args) {

        int cevap = JOptionPane.showConfirmDialog(null, "Programdan çıkmak istiyor musunuz?");
        if (cevap == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "EVET, ÇIKIŞ");
        } else if (cevap == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "HAYIR, ÇIKIŞ YOK");
        } else if (cevap == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "İPTAL");
        }

    }

}
