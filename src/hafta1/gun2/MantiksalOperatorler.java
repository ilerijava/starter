package hafta1.gun2;

/*
 * MantiksalOperatorler sınıfı 
 * ve(&&), 
 * veya(||), 
 * eşittir(==), 
 * eşit değildir(!=),
 * değilini alma(!), 
 * büyüktür(>), 
 * büyük eşittir(>=), 
 * küçüktür(<), 
 * küçük eşittir(<=)
 * operatörlerini içerir.
 */
public class MantiksalOperatorler {

    public static void main(String[] args) {
        //ve(&&) operatörü
        boolean ve1 = true && true;
        System.out.println(ve1);
        boolean ve2 = true && false;
        System.out.println(ve2);
        boolean ve3 = false && true;
        System.out.println(ve3);
        boolean ve4 = false && false;
        System.out.println(ve4);

        //veya(||) operatörü
        boolean veya1 = true || true;
        System.out.println(veya1);
        boolean veya2 = true || false;
        System.out.println(veya2);
        boolean veya3 = false || true;
        System.out.println(veya3);
        boolean veya4 = false || false;
        System.out.println(veya4);

        //eşittir(==) operatörü
        boolean esittir = 10 == 10;
        System.out.println(esittir);

        //eşit değildir(!=) operatörü
        boolean esitDegil = 10 != 10;
        System.out.println(esitDegil);

        ///değilini alma(!) operatörü
        boolean degil1 = !(true && false);
        System.out.println(degil1);
        boolean degil2 = !esittir;
        System.out.println(degil2);

        //büyüktür(>) operatörü
        boolean buyuk1 = 2 > 2;
        System.out.println(buyuk1);

        //büyük eşittir(>=) operatörü
        boolean buyukEsit = 2 >= 2;
        System.out.println(buyukEsit);

        //küçüktür(<) operatörü
        boolean kucuk = 2 < 2;
        System.out.println(kucuk);

        //küçük eşittir(<=) operatörü
        boolean kucukEsit = 2 <= 2;
        System.out.println(kucukEsit);

    }

}
