package hafta2.gun1;

import java.util.Scanner;

/**
 * VKI2 sınıfı kullanıcıdan boy ve kilo değerini alarak Vücut Kitle İndeksine
 * göre kullanıcının kilo durumunu ekrana yazdırır.
 */
public class VKI2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu(kg) giriniz : ");
        double kilo = input.nextDouble();
        System.out.print("Lütfen boyunuzu(m) giriniz : ");
        double boy = input.nextDouble();

        double formul = kilo / Math.pow(boy, 2);

        if (formul < 18.5) {
            System.out.println("zayıf");
        } else if (formul < 24.9) {
            System.out.println("normal");
        } else if (formul < 29.9) {
            System.out.println("kilolu");
        } else {
            System.out.println("aşırı kilolu");
        }
    }
}
