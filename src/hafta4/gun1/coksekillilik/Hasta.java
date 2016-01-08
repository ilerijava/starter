package hafta4.gun1.coksekillilik;

public class Hasta extends Vatandas {

    private int hastaNo;

    public Hasta() {
    }

    public Hasta(int hastaNo) {
        this.hastaNo = hastaNo;
    }

    public int getHastaNo() {
        return hastaNo;
    }

    public void setHastaNo(int hastaNo) {
        this.hastaNo = hastaNo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + hastaNo;
    }

}
