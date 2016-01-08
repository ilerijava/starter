package hafta4.gun2.statics;

import hafta4.gun2.soyutlama.Kare;

public class TestStatic {

    public static void main(String[] args) {
        /**
         * static metot ve özelliklere ise sınıftan nesne oluşturulmadan da
         * erişilebilir.
         */
        double d = StaticSinif.oran;
        System.out.println(d);
        System.out.println(StaticSinif.oran);

        StaticSinif.ekranaYazdir(new Kare(5, "mavi", true));

        int topla = StaticSinif.topla(new int[]{1, 2, 3});
        System.out.println(topla);

    }

}
