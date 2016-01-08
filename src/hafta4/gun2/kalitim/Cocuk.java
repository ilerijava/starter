package hafta4.gun2.kalitim;

public class Cocuk extends Baba {

    private String yaramaz;

    public Cocuk(String yaramaz, boolean caliskanMi,
            String sulale, int para, boolean sinirliMi) {

        super(caliskanMi, sulale, para, sinirliMi);
        this.yaramaz = yaramaz;
        System.out.println("cocuk");
    }

    public String getYaramaz() {
        return yaramaz;
    }

}
