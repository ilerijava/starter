package hafta2.gun1;

/**
 * Tek Satır Koşul İfadesi, if-else ile yazabileceğimiz kodları tek satırda yazabilmemizi
 * sağlar. if-else yapısı ile aynı sonucu verir.
 */
public class TekSatirKosulIfadesi {

    public static void main(String[] args) {

        String cevap = "";
        int i = 59;
        System.out.println(i);

        if (i % 5 == 0) {
            cevap = "5'le bölünür";
        } else {
            cevap = "5'le bölünmez";
        }
        System.out.println(cevap);

        cevap = i % 5 == 0 ? "5'le bölünür" : "5'le bölünmez";
        System.out.println(cevap);

    }

}
