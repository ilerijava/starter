package hafta4.gun2.soyutlama;

/**
 * abstract class(Soyut Sınıf) : Soyut sınıf kendisinden nesne oluşturulamayan
 * içinde soyut metotlar bulunduran sınıftır. Bu metotların içeriği soyut sınıfı
 * extends eden alt sınıflarda doldurulur.
 *
 */
public abstract class GeometrikSekil {

    private String renk;
    private boolean iciDoluMu;

    public GeometrikSekil(String renk, boolean iciDoluMu) {
        this.renk = renk;
        this.iciDoluMu = iciDoluMu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public boolean isIciDoluMu() {
        return iciDoluMu;
    }

    public void setIciDoluMu(boolean iciDoluMu) {
        this.iciDoluMu = iciDoluMu;
    }

    /**
     * cevreHesapla soyut metot olup alt sınıflarda override edilmelidir.
     *
     * @return double
     */
    public abstract double cevreHesapla();

    /**
     * alanHesapla soyut metot olup alt sınıflarda override edilmelidir.
     *
     * @return double
     */
    public abstract double alanHesapla();

    @Override
    public String toString() {
        return "renk : " + renk + "\ndoluMu : " + iciDoluMu;
    }

}
