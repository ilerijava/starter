package hafta2.gun2;

import java.util.Scanner;
/**
 * VKI3 sınıfı
 */
public class VKI3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cevap;
        do {
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

            System.out.print("Tekrar kullanmak için 1, çıkmak için 0 : ");
            cevap = input.nextInt();
        } while (cevap != 0);
        System.out.println("Program bitti");
    }

}
