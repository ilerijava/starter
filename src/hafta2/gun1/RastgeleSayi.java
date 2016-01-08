package hafta2.gun1;
/*
 * RastgeleSayi sınıfı, Javada rastege sayı üretmeye yarayan 2 metodun 
 * örneklerini içerir.
 * 1) Math.random(), double veri tipinde 0 ile 1 arasında rastgele sayı üretir.
 * 2) System.currentTimeMillis(), long veri tipinde 01.01.1970 yılından beri 
 * geçen zamanı mili saniiye cinsinden tutmaktadır.
 */

public class RastgeleSayi {

    public static void main(String[] args) {
        /**
         * 0-10 arası sayı üretir.
         */
        int sayi = (int) (Math.random() * 10);
        System.out.println(sayi);

        /**
         * 0-100 arası sayı üretir.
         */
        int sayi1 = (int) (System.currentTimeMillis() % 100);

        System.out.println(sayi1);

    }

}
