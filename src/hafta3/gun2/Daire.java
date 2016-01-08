package hafta3.gun2;

/**
 * Daire sınıfı üzerinde yarıçap özelliği, cevreHesapla ve alanHesapla
 * metotlarını içerir.
 */
public class Daire {

    /**
     * yarıçap özelliği
     */
    double yaricap;

    public Daire() {
        System.out.println("önce daire kurucu metodu");
    }

    public Daire(double d) {
        yaricap = d;
    }

    /**
     * Dairenin çevresini hesaplayıp geri döner.
     *
     * @return double
     */
    double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }

    /**
     * Dairenin alanını hesaplayıp geri döner.
     *
     * @return double
     */
    double alanHesapla() {
        return Math.PI * Math.pow(yaricap, 2);
    }

}
