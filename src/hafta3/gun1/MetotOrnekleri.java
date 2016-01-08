package hafta3.gun1;

/*
 Metot : Metot yazdığımız kodların tekrar kullanılabilir, düzenli ve
 basit olmasını sağlar. 5 kısımdan oluşur:                       
 1. modifier(public, protected, [default], private) ve static( static metotlara erişim ), 
 2. return-value(geri dönüş değeri),
 3. metot adı,
 4. parametre listesi

 Metot İmzası : Bir metodun diğer metotlardan ayırt edilmesinde metodun 
 iki özelliğine bakılır.
 1. metot adı
 2. parametre listesi
 Bu iki özellik bir metodu diğer metottan ayırır.
 */
public class MetotOrnekleri {

    public static void main(String[] args) {
        int toplam1 = topla(0, 10);
        ekranaYazdir("1 - 10 toplam = " + toplam1);
        int toplam2 = topla(20, 40);
        ekranaYazdir(20, 40, toplam2);

    }

    /**
     * topla metodu toplama işi yapar.
     *
     * @param baslangic
     * @param bitis
     * @return
     */
    public static int topla(int baslangic, int bitis) {
        int toplam = 0;
        for (int i = baslangic; i < bitis; i++) {
            toplam = toplam + i;
        }
        return toplam;
    }

    /**
     * ekranaYazdir metodu aldığı String parametreyi ekrana yazdırır.
     *
     * @param str
     */
    public static void ekranaYazdir(String str) {
        System.out.println(str);
    }

    /**
     * ekranaYazdir metodu aldığı integer parametreleri ekrana yazdırır.
     *
     * @param a
     * @param b
     * @param c
     */
    public static void ekranaYazdir(int a, int b, int c) {
        System.out.println(a + " - " + b + " toplam = " + c);
    }
}
