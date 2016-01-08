package hafta4.gun1.kalitim;

public class Daire {

    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
        System.out.println("1");
    }
    
    public Daire(){
        this(5.0);
    }

    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }

    public double alanHesapla() {
        return Math.PI * Math.pow(yaricap, 2);
    }
    
    public double getYaricap(){
        return yaricap;
    }
    
    public void setYaricap(double yaricap){
        this.yaricap = yaricap;
    }

}
