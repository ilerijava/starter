package hafta2.gun2;

import java.util.Scanner;

/**
 * DonguTest sınıfı, while, do-while ve for döngüsüne ait örnekleri içerir.
 */
public class DonguTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int k = 1; k <= 9; k++) {
            System.out.printf("%5d", k);
        }
        System.out.println("");
        System.out.printf("%5s", "-");
        System.out.println("");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i);

            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println("");
        }

        int sayi, toplam = 0;
        do {
            System.out.print("Lütfen sayı giriniz(Çıkmak için 0) : ");
            sayi = input.nextInt();
            toplam += sayi;
        } while (sayi != 0);
        System.out.println("toplam = " + toplam);

        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);

        System.out.print(random1 + " + " + random2 + " = ? ");

        int cevap = input.nextInt();

        while (random1 + random2 != cevap) {
            System.out.print("Yanlış cevap, tekrar dene : ");
            cevap = input.nextInt();
        }

        System.out.println("Tebrikler cevap doğru");
    }
}
