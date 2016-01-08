package hafta2.gun2;

import java.util.Scanner;

/**
 * AsalSayi sınıfı, 2'den başyayıp kullanıcıdan alınan üst limite kadar olan
 * bütün asal sayıları ekrana yazdırır.
 */
public class AsalSayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int ustLimit = input.nextInt();
        int sayi = 2;

        while (sayi <= ustLimit) {

            boolean asalMi = true;

            /**
             * 2'den başlayıp sayının en büyük böleni olan yarısına kadar bütün
             * bölenleri kontrol et. Eğer böleni yoksa sayı asaldır, herhangi
             * bir böleni varsa sayı asal değildir.
             */
            for (int bolen = 2; bolen <= sayi / 2; bolen++) {
                if (sayi % bolen == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(sayi + " ");
            }

            /**
             * Her sayı değeri 100'ün katı olduğunda bir satır alta in.
             */
            if (sayi % 100 == 0) {
                System.out.println("");
            }

            sayi++;
        }
    }
}
