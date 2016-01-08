package hafta3.gun2;

/**
 * StringOrnekleri3 sınıfı + operatörünün String sınıfı ile kullanımını anlatır.
 * String değerden sonra + gelirse sonrasında gelen bütün değerleri birbirine
 * sözel olarak ekler.
 */
public class StringOrnekleri3 {

    public static void main(String[] args) {

        System.out.println(12 + 13);
        System.out.println("Sonuç = " + 12 + 13);
        System.out.println(12 + 13 + " = " + 25);
        System.out.println(12 + 13 + " = " + 12 + 13);
        System.out.println(12 + 13 + " = " + (12 + 13));
    }
}
