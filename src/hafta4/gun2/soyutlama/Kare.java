package hafta4.gun2.soyutlama;

public class Kare extends GeometrikSekil {

    private double kenar;

    public Kare(double kenar, String renk, boolean iciDoluMu) {
        super(renk, iciDoluMu);
        this.kenar = kenar;
    }

    public double getKenar() {
        return kenar;
    }

    /**
     * alanHesapla soyut metot olup üst sınıftan gelmektedir.
     *
     * @return double
     */
    @Override
    public double alanHesapla() {
        return Math.pow(kenar, 2);
    }

    /**
     * cevreHesapla soyut metot olup üst sınıftan gelmektedir.
     *
     * @return double
     */
    @Override
    public double cevreHesapla() {
        return 4 * kenar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nkenar : " + kenar;
    }

}
