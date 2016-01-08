package hafta1.gun2;


/*
 * IlkelVeriTipleri sınıfı ilkel veri tiplerini (primitive types)
 * anlatmaktadır. Toplamda 8 adet ilkel veri tipi bulunmaktadır.
 * byte 
 * short 
 * int 
 * long 
 * float
 * double
 * char
 * boolean
 */
public class IlkelVeriTipleri {

    public static void main(String[] args) {

        //1) Sayısal Veri Tipleri
        byte byteSayi = 127; //  -128'den 127'e kadar olan değerleri tutabilir.
        short kisaSayi = 32767; // -32768'den 32767'ee kadar olan değerleri tutabilir.
        int sayi = 123456789; // -2147483648'den 2147483647'ye kadar olan değerleri tutabilir.
        long uzunSayi = 1234567899999999L; // -9223372036854775808'den 9223372036854775807'ye kadar olan değerleri tutabilir.

        float floatSayi = 12.345678f; // Ondalıklı sayılar için kullanılır. double'a göre küsürat kapsamı daha dardır.
        double doubleSayi = 123.323232323232;//  Ondalıklı sayılar için kullanılır. float'a göre küsürat kapsamı daha geniştir.

        //2) Karakter Veri Tipi
        char karakter1 = '#'; // Karakter ifadeleri için kullanılır.(ASCII)
        char karakter2 = '\u3245'; // Karakter ifadeleri için kullanılır.(Unicode)
        char karakter3 = 65; // Karakter ifadeleri için kullanılır.(ASCII)

        //3) Mantıksal Veri Tipi
        boolean dogru = true; // Mantıksal işlemler için kullanılır. true veya false değerini alabilir.
        boolean yanlis = false; // Mantıksal işlemler için kullanılır. true veya false değerini alabilir.
    }
}
