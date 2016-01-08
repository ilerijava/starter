package hafta4.gun1.coksekillilik;

public class YuksekOgrenci extends Ogrenci {

    private String tezKonusu;

    public YuksekOgrenci() {
    }

    public String getTezKonusu() {
        return tezKonusu;
    }

    public void setTezKonusu(String tezKonusu) {
        this.tezKonusu = tezKonusu;
    }

    @Override
    public String toString() {
        return super.toString() + " " + tezKonusu;
    }

}
