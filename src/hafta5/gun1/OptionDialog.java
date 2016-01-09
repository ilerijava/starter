package hafta5.gun1;

import javax.swing.JOptionPane;

public class OptionDialog {

    public static void main(String[] args) {

        String[] str = {"EVET", "HAYIR", "İPTAL"};
        int cevap = JOptionPane.showOptionDialog(null, "İslem yapmak istiyor musunuz?", "İŞLEM",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, str, 1);
        if (cevap == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "EVET, İSTİYORUM");
        } else if (cevap == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "HAYIR, İSTEMİYORUM");
        } else if (cevap == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "İPTAL");
        }
    }

}
