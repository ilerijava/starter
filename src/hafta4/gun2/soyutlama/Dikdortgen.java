package hafta4.gun2.soyutlama;

public class Dikdortgen extends GeometrikSekil {

    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar, String renk, boolean iciDoluMu) {
        super(renk, iciDoluMu);
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    /**
     * alanHesapla soyut metot olup üst sınıftan gelmektedir.
     *
     * @return double
     */
    @Override
    public double alanHesapla() {
        return kisaKenar * uzunKenar;
    }

    /**
     * cevreHesapla soyut metot olup üst sınıftan gelmektedir.
     *
     * @return double
     */
    @Override
    public double cevreHesapla() {
        return 2 * (kisaKenar + uzunKenar);
    }

    @Override
    public String toString() {
        return super.toString() + "\nkısa kenar : " + kisaKenar + "\nuzun kenar : " + uzunKenar;
    }

}
