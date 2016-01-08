package hafta4.gun1.coksekillilik;

/**
 * Çok Şekillilik(Polymorphism)
 *
 * Alt sınıfın, üst sınıf cinsinden yazılabilmesine imkan sağlar.
 *
 * Alt sınıftan üst sınıf cinsinden nesne oluşturulabilir.
 *
 * Üst sınıf alt sınıfa daraltılarak kullanılabilir.(Casting)
 *
 * instanceof bir nesnenin bir sınıftan türeyip türemediğine dair karşılaştırma
 * yapmayı sağlar.
 */
public class TestCokSekillilik {

    public static void main(String[] args) {

        Vatandas v1 = new Vatandas();
        v1.setAd("Ali");
        v1.setSoyad("Çelik");
        v1.setTcKimlikNo(12345678);

        Ogrenci o1 = new Ogrenci();
        o1.setAd("Hakan");
        o1.setSoyad("Demir");
        o1.setTcKimlikNo(789456);
        o1.setOgrenciNo(101020);

        /**
         * Alt sınıftan üst sınıf cinsinden nesne oluşturulabilir.
         */
        Vatandas o2 = new Ogrenci();
        o2.setAd("Hüseyin");
        o2.setSoyad("Yılmaz");
        o2.setTcKimlikNo(6546546);

        /**
         * Üst sınıf alt sınıfa daraltılarak kullanılabilir.(Casting)
         */
        ((Ogrenci) o2).setOgrenciNo(345345);

        YuksekOgrenci yo1 = new YuksekOgrenci();
        yo1.setAd("Ahmet");
        yo1.setSoyad("Doğan");
        yo1.setTcKimlikNo(1111111);
        yo1.setOgrenciNo(102030);
        yo1.setTezKonusu("Automatic Lane Keeping");

        Hasta h1 = new Hasta(656565);
        h1.setAd("Veli");
        h1.setSoyad("Dayı");
        h1.setTcKimlikNo(777777777);

        ekranaYazdir(v1);
        ekranaYazdir(o1);
        ekranaYazdir(o2);
        ekranaYazdir(yo1);
        ekranaYazdir(h1);

        Vatandas v2 = new Vatandas();
        v2.setAd("Veli");
        v2.setSoyad("Yılmaz");
        v2.setTcKimlikNo(12345678);

        System.out.println(v1 + " " + v2 + " == " + (v1 == v2));
        System.out.println("equals " + v1.equals(v2));

    }

    /**
     * ekranaYazdir metodu Vatandas sınıfında türeyen nesnelerrin bilgilerini
     * toString metotları yoluyla ekrana yazdırır.
     *
     * @param v Vatandas
     */
    public static void ekranaYazdir(Vatandas v) {
        System.out.println(v);
        /**
         * instanceof bir nesnenin bir sınıftan türeyip türemediğine dair
         * karşılaştırma yapmayı sağlar.
         */
        if (v instanceof Ogrenci) {
            int ogrenciNo = ((Ogrenci) v).getOgrenciNo();
            System.out.println("--öğrenci no : " + ogrenciNo);
            if (v instanceof YuksekOgrenci) {
                String tezKonusu = ((YuksekOgrenci) v).getTezKonusu();
                System.out.println("----tez konusu : " + tezKonusu);
            }
        }
        System.out.println("");
        System.out.println("");
    }
}
