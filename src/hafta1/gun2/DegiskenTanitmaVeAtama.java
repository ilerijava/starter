package hafta1.gun2;
/*
 * DegiskenTanitmaVeAtama sınıfı değişken tanımlamada 
 * kullanılan yöntemleri içerir. Değişkenle alakalı 3 kavram vardır:
 * 1) Değişken Tanıtma
 * 2) Değişkene Değer Atama
 * 3) Değişken Tanımlama
 */

public class DegiskenTanitmaVeAtama {

    public static void main(String[] args) {
        /* 1)
         * değişken_tipi değişken_adı;
         * Bu işleme "Değişken Tanıtma" adı verilir. (Variable Declaration)
         *
         * Bu işlemden sonra değişkenin bulunduğu kod bloğunda({...} arası)
         * aynı isimde başka bir değişken tanımlayamayız.
         *
         * Bu aşamada değişkenin değeri yoktur. 
         */
        int sayi;

        /* 2)
         * değişken_adı = değişken_değeri;
         * Bu işleme "Değişkene Değer Atama" adı verilir. (Variable Initialization)
         * 
         * Değişken bu adımdan sonra kendine atanan değeri taşır 
         * ve  o değerle işlem girer.
         */
        sayi = 10;
        System.out.println(sayi);

        /* 3)
         * değişken_tipi değişken_adı = değişken_değeri;
         * Bu işleme "Değişken Tanımlama" adı verilir. (Variable Definition)
         * 
         * Yukarıdaki iki işlem tek satırda gerçekleştilirmiştir.
         */
        double sapmaOrani = 2.45;
    }
}
