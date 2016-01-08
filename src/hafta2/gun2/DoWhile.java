package hafta2.gun2;

/**
 * DoWhile sınıfı, do-while döngüsüne dair örnekleri içerir. do-while döngüsü
 * önce çalış sonra sor prensibine göre çalışır. Eğer koşul sağlanmıyorsa
 * döngüden çıkılır. do-while döngüsü while döngüsünden en az 1 kere fazla
 * çalışır.
 */
public class DoWhile {

    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println("Merhaba Java " + i);
            i++;
        } while (i < 0);

        System.out.println(i);

    }

}
