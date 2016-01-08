package hafta4.gun2.kalitim;

public class TestKalitim {

    public static void main(String[] args) {

        Dede dede = new Dede("tellioğulları", 1000, true);
        System.out.println(dede.getPara());
        System.out.println(dede.getSulale());

        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Baba baba = new Baba(false, "sefer", 500000, true);
        System.out.println(baba.getSulale());
        System.out.println(baba.getPara());
        
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Cocuk cocuk = new Cocuk("afacan", true, "telli", 3000, true);
        System.out.println(cocuk.getPara());
        System.out.println(cocuk.isCaliskanMi());
        System.out.println(cocuk.getYaramaz());

    }

}
