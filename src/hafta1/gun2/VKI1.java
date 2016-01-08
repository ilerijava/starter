package hafta1.gun2;

/**
 * VKI1 sınıfı, kilo(kg) ve boy(mt) değerlerini alır ve Vücut Kitle Endeksi
 * formülüne göre(kilo/boy^2) sonucu hesaplar, ekrana yazdırır.
 */
public class VKI1 {

    public static void main(String[] args) {

        double boy = 1.70;
        double kilo = 70.5;

        /**
         * Vücut Kitle Endeksi formülü
         */
        double sonuc = kilo / (boy * boy);

        System.out.println(sonuc);
        /**
         * printf = Verilen değeri formatlar ve sonra değerin formatlanmış
         * halini ekrana yazdırır.
         */
        System.out.printf("%.4f", sonuc);
        /**
         * println = Ekrana yazdırma işleminden sonra bir alt satırdan devam
         * eder.
         */
        System.out.println("");

    }

}
