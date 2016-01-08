package hafta2.gun1;

/**
 * DegerAlma sınıfı kullanıcıdan değer almak için kullanılan Scanner sınıfına
 * örnekleri içerir.
 */
import java.util.Scanner;

public class DegerAlma {

    public static void main(String[] args) {

        /*
         * Konsoldan değer almak için öncelikle Scanner sınıfından input adında
         * bir nesne oluşturuyoruz.
         */
        Scanner input = new Scanner(System.in);
        /*
         * Kullanıcıdan ne isteneceğini ekrana yazdırıyoruz. 
         */
        System.out.print("Lütfen bir sayı giriniz :  ");
        /*
         * Kullanıcı veriyi girip enter tuşuna bastıktan sonra gelen veriyi 
         * uygun tipte bir değişkende tutuyoruz.
         */
        int sayi = input.nextInt();
        System.out.println("sayı = " + sayi);

        System.out.print("Lütfen adınızı yazınız : ");
        String str = input.next();
        System.out.println(str);
    }

}
