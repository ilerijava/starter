package hafta3.gun1;

/**
 * CokBoyutluDizi sınıfı çok boyutlu dizi yapısının kullanımını anlatır. Çok
 * boyutlu diziler tek boyutlu dizilerden oluşmaktadır.
 */
public class CokBoyutluDizi {

    public static void main(String[] args) {
        /*
         * 2 boyutlu 2X3 birimlik bir dizi. 
         * 2 satır, 3 sütun 
         *    0    1    2  
         * 0| 10 |   |    |
         * 1|    |   | 20 |
         */
        int[][] dizi1 = new int[2][3];
        dizi1[0][0] = 10;
        dizi1[1][2] = 20;
        /**
         * dizi1.length ifadesinin değeri 2'dir. Yani satır değerini geri döner.
         */
        for (int i = 0; i < dizi1.length; i++) {
            int[] a = dizi1[i];
            for (int j = 0; j < a.length; j++) {
                System.out.println(i + " " + j + " " + a[j]);
            }
        }

        for (int[] a : dizi1) {
            for (int b : a) {
                System.out.println(b);
            }
        }
    }
}
