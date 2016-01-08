package hafta1;

/**
 * DegiskenKapsami sınıfı global değişken, lokal değişken kavramlarına
 * dair örnekleri içerir.
 */
public class DegiskenKapsami {

    /**
     * globalDegisken isimli değişkene sınıfın herhangi bir yerinden
     * ulaşabiliriz. Çünkü kapsami sınıfın parantezleri arasındadır.
     */
    static int globalDegisken = 15;

    public static void main(String args[]) {
        /**
         * lokalDegisken1 isimli değişkene içinde bulunduğu main metodu içinde
         * erişilebilir.
         */
        int lokalDegisken1;

        lokalDegisken1 = 12;
        System.out.println(lokalDegisken1);

        /**
         * lokalDegisken2 isimli değişkene içinde bulunduğu main metodu içinde
         * erişilebilir.
         */
        int LokalDegisken2 = 13;

        System.out.println(LokalDegisken2);

        {
            System.out.println(LokalDegisken2);
            /**
             * lokalDegisken3 isimli değişkene sadece içinde bulunduğu
             * parantezler arasında erişilebilir.
             */
            boolean lokalDegisken3 = false;
            System.out.println(lokalDegisken3);
        }

        /**
         * Burada lokalDegisken3 isimli değişkene ulaşamayız. Çünkü kapsamı
         * içinde bulunduğu parantezler arasındadır.
         */
        //System.out.println(lokalDegisken3);
        System.out.println(globalDegisken);

    }

    {
        /**
         * Burada lokalDegisken2 isimli değişkene ulaşamayız. Çünkü kapsamı
         * içinde bulunduğu parantezler arasındadır.
         */
        //lokalDegisken2 = 14;
        System.out.println(globalDegisken);
    }
}
