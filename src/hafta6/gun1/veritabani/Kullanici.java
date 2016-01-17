package hafta6.gun1.veritabani;

public class Kullanici {

    private int id;
    private String ad;
    private String soyad;
    private String kullaniciAdi;
    private String sifre;

    public Kullanici(String ad, String soyad, String kullaniciAdi, String sifre) {
        this.ad = ad;
        this.soyad = soyad;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    public Kullanici(int id, String ad, String soyad, String kullaniciAdi, String sifre) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Kullanici{" + "id=" + id + ", ad=" + ad + ", soyad="
                + soyad + ", kullaniciAdi=" + kullaniciAdi + ", sifre=" + sifre + '}';
    }
    
    

}
