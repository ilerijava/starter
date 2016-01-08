package hafta4.gun1.kalitim;

public class Silindir extends Daire {

    private double yukseklik;

    public Silindir(double yukseklik, double yaricap) {
        super(yaricap);
        this.yukseklik = yukseklik;
        System.out.println("2");
    }

    public Silindir() {
        this(15.0, 10.0);
        System.out.println("3");
    }

    @Override
    public double cevreHesapla() {
        return 2 * super.cevreHesapla() + 2 * (super.cevreHesapla() + yukseklik);
    }

    @Override
    public double alanHesapla() {
        return 2 * super.alanHesapla() + super.cevreHesapla() * yukseklik;
    }

    public double hacimHesapla() {
        return super.alanHesapla() * yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }
    
    

}
