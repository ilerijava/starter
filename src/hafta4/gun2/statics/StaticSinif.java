package hafta4.gun2.statics;

/**
 * static : Sınıftan nesne oluşturulmadan da erişilebilir özellik ve metot
 * oluşturulmasını sağlar.
 */
public class StaticSinif {

    public StaticSinif() {
    }

    public static final double oran = 1.2;

    public static void ekranaYazdir(Object obj) {
        System.out.println(obj);
    }

    public static int topla(int[] dizi) {
        int toplam = 0;
        for (int i : dizi) {
            toplam += i;
        }
        return toplam;
    }

    public final void finalMetot() {
        System.out.println("final Metot");
    }

}
