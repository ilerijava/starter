package hafta5.gun2.dosya;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("log.doc");
            for (int i = 0; i < 10; i++) {
                fos.write(i);
            }
            
            fos.write("deneme".getBytes());

            FileInputStream fis = new FileInputStream("log.doc");
            int read;
            while((read= fis.read()) != -1){
                System.out.println(read);   
            }
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("dosya bulunamadı");
            } else if (e instanceof IOException) {
                System.out.println("veri yazılamadı");
            } else {
                System.out.println("başka bir hata oluştu");
            }
        }

    }

}
