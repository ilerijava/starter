package hafta4.gun2;

public class VKI5 {

    private double kilo;
    private double boy;
    private double sonuc;

    public VKI5(double boy, double kilo) {
        this.boy = boy;
        this.kilo = kilo;
    }

    public double getKilo() {
        return kilo;
    }

    public double getBoy() {
        return boy;
    }

    public double getSonuc() {
        return sonuc;
    }

    public void formulHesapla() {
        sonuc = kilo / Math.pow(boy, 2);
    }

    public String degenlendir() {
        if (sonuc < 18.5) {
            return "zayıf";
        } else if (sonuc < 24.9) {
            return "normal";
        } else if (sonuc < 29.9) {
            return "kilolu";
        } else {
            return "aşırı kilolu";
        }
    }

    @Override
    public String toString() {
        return "kilo : " + kilo + "\nboy : " + boy;
    }

}
