package hafta2.gun2;

/**
 * While sınıfı, while sınıfına ait örnek içerrir. while döngüsü önce sor sonra
 * çalış prensibine göre çalışır.
 */
public class While {

    public static void main(String[] args) {

        int i = 0;
        while (i < 0) {
            System.out.println("Merhaba Java " + i);
            i++;
        }

        System.out.println(i);

    }

}
