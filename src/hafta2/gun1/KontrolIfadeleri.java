package hafta2.gun1;

/**
 * KontrolIfadeleri sınıfı koşullar yardımıyla kod akışını kontrol etmeyi
 * sağlayan if ve if-else yapısına dair örnekleri içerir.
 */
public class KontrolIfadeleri {

    public static void main(String[] args) {
        int x = 15;
        boolean buyukBesMi = x > 5;
        if (buyukBesMi == true) 
            x = x + 5;
        
        System.out.println(x);

        if (x > 20) 
            System.out.println("x 20'den büyüktür");
        
        if (x <= 20) 
            System.out.println("x küçük eşit 20");
        
        boolean kucukBirMi = x < 1;
        if (!kucukBirMi) 
            x = x - 1;
        
        System.out.println(x);

        int puan = 90;
        int dogumYili = 1985;

        if (puan > 75 && dogumYili < 1995 ) 
            System.out.println("başvuru yapabilirsin");
        
        boolean islem = (true && false) || (12 <= 34);

        /**
         * if ifadesi koşulun sağlanması durumunda çalışır.
         * else ifadesi koşulun sağlanmaması durumunda çalışır.
         */
        if (!islem) 
            System.out.println("işlem sağlandı");
        else 
            System.out.println("işlem sağlanmadı");
    }
}
