package hafta5.gun2.hatayonetim;

public class BankaHesabi {

    private long bankaHesapNo;
    private double miktar;

    public BankaHesabi(long bankaHesapNo, double miktar) {
        this.bankaHesapNo = bankaHesapNo;
        this.miktar = miktar;
    }

    public long getBankaHesapNo() {
        return bankaHesapNo;
    }

    public double getMiktar() {
        return miktar;
    }

    public void paraCek(double para) throws YetersizBakiyeException {
        if (para > miktar) {
            double fark = para - miktar;
            throw new YetersizBakiyeException(fark);
        } else {
            miktar -= para;
        }
    }

    public void paraYatir(double para) {
        miktar += para;
    }

}
