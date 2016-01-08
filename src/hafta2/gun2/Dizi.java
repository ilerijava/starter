package hafta2.gun2;

/**
 * Dizi sınıfı, tek boyutlu dizi tanımı ve örneklerini içerir.
 */
public class Dizi {

    public static void main(String[] args) {
        /**
         * Dizi tanımı farklı şekillerde yapılabilir. Dizinin boyutu baştan
         * belirtilmelidir.
         */
        int[] dizi1 = new int[5];
        int[] dizi2 = new int[5];
        int[] dizi3 = new int[5];
        int dizi4[] = new int[5];

        /*
         * Dizinin elemanlarına değer atamak için indeks numarası kullanılır.
         * İndeks numarası 0'dan başlar, dizinin boyutunun 1 eksiğine kadar
         * devam eder. 
         * 0. indeks -> 1. eleman
         * 1. indeks -> 2. eleman
         * 2. indeks -> 3. eleman
         *      .            .   
         *      .            .   
         *      .            .   
         * Dizi Boyutu - 1. indeks -> Sonuncu. eleman
         */
        dizi1[0] = 10;
        dizi1[1] = 11;
        dizi1[2] = 12;
        dizi1[3] = 13;
        dizi1[4] = 14;
        /**
         * Dizinin olmayan bir indeks numarasına değer atanması durumunda
         * dizinin o elemanına ulaşılamayacağı için ArrayIndexOutOfBondException
         * hatası alınır.
         */
        dizi1[5] = 15;

        /**
         * bir dizinin boyutunu öğrenmek için dizinin length özelliği
         * kullanılır. Dizinin adından .length yazılarak dizinin boyut bilgisi
         * alınabilir.
         */
        int dizininBoyutu = dizi1.length;

        for (int i = 0; i < dizininBoyutu; i++) {
            System.out.println(i + " " + dizi1[i]);
        }

        /**
         * Boş bir int tipinde dizinin elemanlarının ilk değeri 0 olarak
         * verilir.
         */
        System.out.println(dizi1[4]);
        System.out.println(dizi2[2]);

        boolean bDizi[] = new boolean[3];

        /**
         * Boş bir boolean tipinde dizinin elemanlarının ilk değeri false olarak
         * verilir.
         */
        System.out.println(bDizi[2]);

        /**
         * Dizi tanımlanırken diziye boyut tanımlanmadan da eleman eklenebilir.
         * Bu durumda dizinin boyutu eklenen elemanlar kadar olup diziye
         * sonradan eleman eklenemez.
         */
        double d1[] = new double[]{3.14, 2.71, 1.234, 3.456};

        System.out.println(d1[3]);

        /**
         * Diziye boyut tanımlanmadan eleman eklemek bu şekilde de mümkündür.
         */
        int i2[] = {1, 2, 3, 4, 5, 6};
        System.out.println(i2[3]);
        i2[2] = 10;
        System.out.println(i2[2]);

        /**
         * Foreach döngüsü for döngüsünün özelleşmiş bir şekli olup diziler için
         * kullanılabilir.
         */
        for (int sayac : i2) {
            sayac = 14;
            System.out.println(sayac);

        }

        /**
         * Diziyi kopyalamak için 1. yöntem : yeni bir dizi tanımlayıp
         * kopyalanacak diziyi yeni diziye eşitleyebiliriz.
         */
        int kopya1[] = i2;

        for (int el : kopya1) {
            System.out.println(el);
        }

        /**
         * Diziyi kopyalamak için 2. yöntem : yeni bir dizi tanımlayıp
         * kopyalanacak dizinin elemanlarını bir döngü yardımıyla yeni diziye
         * kopyalayabliriz.
         */
        int kopya2[] = new int[i2.length];
        for (int i = 0; i < kopya2.length; i++) {
            kopya2[i] = i2[i];
        }

        for (int a : kopya2) {
            System.out.println(a);
        }
    }
}
