package hafta4.gun1.kalitim;

/**
 * Kalıtım(Inheritance)
 *
 * Bir sınıftan yeni sınıflar oluşturma işlemine denir.
 *
 * Mevcut sınıfa üst sınıf(super class), bu sınıftan oluşturulan yeni sınıfa alt
 * sınıf(sub class) adı verilir.
 *
 * extends kelimesi kullanılarak iki sınıf arasında bağ oluşturulur.
 *
 * Alt sınıf üst sınıfın private olmayan değişken ve metotlarını kulllanabilir.
 *
 * super kelimesi ile üst sınıfa referans vererek üst sınıfın private olmayan
 * kurucu metot, değişken ve metotlarına erişebilir.
 */
public class TestKalitim {

    public static void main(String[] args) {

        Daire d1 = new Daire(10);
        double cevre = d1.cevreHesapla();
        double alan = d1.alanHesapla();
        double yaricap = d1.getYaricap();
        System.out.println("yaricap : " + yaricap);
        System.out.println("cevre : " + cevre);
        System.out.println("alan : " + alan);

        Silindir s = new Silindir(12, 13);

        double yaricap1 = s.getYaricap();
        double yukseklik1 = s.getYukseklik();
        double cevre1 = s.cevreHesapla();
        double alan1 = s.alanHesapla();
        System.out.println("yaricap1 : " + yaricap1);
        System.out.println("yukseklik1 : " + yukseklik1);
        System.out.println("cevre1 : " + cevre1);
        System.out.println("alan1 : " + alan1);

    }

}
