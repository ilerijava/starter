package hafta4.gun1.coksekillilik;

import java.util.Date;

public class Vatandas {

    private long TcKimlikNo;
    private String ad;
    private String soyad;
    private Date dogumTarihi;

    public Vatandas() {
    }

    public long getTcKimlikNo() {
        return TcKimlikNo;
    }

    public void setTcKimlikNo(long TcKimlikNo) {
        this.TcKimlikNo = TcKimlikNo;
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

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return ad + " " + soyad + " " + TcKimlikNo + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        return this.getTcKimlikNo() == ((Vatandas) obj).getTcKimlikNo();
    }

}
