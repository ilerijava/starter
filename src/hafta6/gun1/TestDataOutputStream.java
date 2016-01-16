package hafta6.gun1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestDataOutputStream {

    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream("log.doc"));
            dos.writeBytes("deneme");
            dos.write(2048);
            dos.close();

            DataInputStream dis = new DataInputStream(
                    new FileInputStream("log.doc"));
            int i;
            while ((i = dis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("\ndosya sonu ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
