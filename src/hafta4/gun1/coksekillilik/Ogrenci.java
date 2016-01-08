package hafta4.gun1.coksekillilik;

public class Ogrenci extends Vatandas {

    private int ogrenciNo;

    public Ogrenci() {
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + ogrenciNo;
    }

}
