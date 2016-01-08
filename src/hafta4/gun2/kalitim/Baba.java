package hafta4.gun2.kalitim;

public class Baba extends Dede{
    
    private boolean caliskanMi;

    public Baba(boolean caliskanMi, String sulale, int para, boolean sinirliMi) {
        super(sulale, para, sinirliMi);
        this.caliskanMi = caliskanMi;
        System.out.println("baba");
    }

    public boolean isCaliskanMi() {
        return caliskanMi;
    }
    
    

   

    
    

    
    
    
    
    
}
