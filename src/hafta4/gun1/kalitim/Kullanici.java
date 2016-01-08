package hafta4.gun1.kalitim;

public class Kullanici {

    private String ad;
    private String soyad;
    private int yas;
    private String eposta;
    private String sifre;
    private String kullaniciAdi;

    /**
     * Kurucu metot(Constructor)
     *
     * @param sifre
     * @param kullaniciAdi
     */
    public Kullanici(String sifre, String kullaniciAdi) {
        this.sifre = sifre;
        this.kullaniciAdi = kullaniciAdi;
    }

    /**
     * Kurucu metot(Constructor)
     */
    public Kullanici() {
    }

    /**
     * Kurucu metot(Constructor)
     *
     * @param ad
     * @param soyad
     * @param yas
     * @param eposta
     * @param sifre
     * @param kullaniciAdi
     */
    public Kullanici(String ad, String soyad, int yas, String eposta, String sifre, String kullaniciAdi) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.eposta = eposta;
        this.sifre = sifre;
        this.kullaniciAdi = kullaniciAdi;
    }

    /*
     * getter/setter metotlar 
     */
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
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

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}
