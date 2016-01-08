package hafta4.gun2.kalitim;

public class Dede {

    private String sulale;
    private int para;
    private boolean sinirliMi;

    public Dede(String sulale, int para, boolean sinirliMi) {
        this.sulale = sulale;
        this.para = para;
        this.sinirliMi = sinirliMi;
        System.out.println("dede");
    }

    public String getSulale() {
        return sulale;
    }

    public int getPara() {
        return para;
    }

    public void setSulale(String sulale) {
        this.sulale = sulale;
    }

    public void setPara(int para) {
        this.para = para;
    }

}
