package hafta5.gun2.dosya;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class DosyaSecim {

    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser();

        int showDialog = fileChooser.showDialog(null, "Tamam");
        if (showDialog == JFileChooser.APPROVE_OPTION) {
            try {
                System.out.println("dosya seçili");
                File selectedFile = fileChooser.getSelectedFile();
                String fileName = selectedFile.getName();
                System.out.println(fileName);
                String[] split = fileName.split("\\.");
                if (!split[1].equals("txt")) {
                    JOptionPane.showMessageDialog(null, "Lütfen TXT dosyası seçiniz");
                    return;
                }
                System.out.println(selectedFile.getAbsolutePath());
                Scanner input = new Scanner(selectedFile);
                while (input.hasNextLine()) {
                    String next = input.nextLine();
                    System.out.println(next);
                }
                input.close();
                /**
                 * Dosyaya ekleme yapmak(append) için FileOutputStream ile
                 * kullanmak gerekiyor.
                 */
                PrintWriter writer = new PrintWriter(new FileOutputStream(selectedFile, true));
                writer.write("yeni");
                writer.flush();
                writer.close();
            } catch (FileNotFoundException e) {
                System.out.println("dosya bulunamadı");
            }
        } else {
            System.out.println("işlem iptal");
        }

    }

}
