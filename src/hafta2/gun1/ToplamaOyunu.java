package hafta2.gun1;

import java.util.Scanner;

/**
 * ToplamaOyunu, kullanıcıya rastgele olarak üretilen iki sayının toplamını
 * sorar ve doğru cevap verip vermediğni kontrol eder.
 */
public class ToplamaOyunu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rastgeleSayi1 = (int) (Math.random() * 100);
        int rastgeleSayi2 = (int) (System.currentTimeMillis() % 100);

        System.out.print(rastgeleSayi1 + " + " + rastgeleSayi2 + " = ?");
        int toplam = input.nextInt();
        if (toplam == (rastgeleSayi1 + rastgeleSayi2)) {
            System.out.println("Tebrikler, doğru cevap");
        } else {
            System.out.println("Yanlış cevap, cevap = "
                    + (rastgeleSayi1 + rastgeleSayi2));
        }

    }

}
