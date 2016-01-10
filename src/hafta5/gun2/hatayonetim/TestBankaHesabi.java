package hafta5.gun2.hatayonetim;

public class TestBankaHesabi {

    public static void main(String[] args) {
        try {
            BankaHesabi bh = new BankaHesabi(986546456, 100);
            System.out.println("Bakiye : " + bh.getMiktar());
            bh.paraYatir(50);
            System.out.println("Bakiye : " + bh.getMiktar());
            bh.paraCek(50);
            System.out.println("Bakiye : " + bh.getMiktar());
            bh.paraCek(150);
            System.out.println("Bakiye : " + bh.getMiktar());
        } catch (YetersizBakiyeException ybe) {
            System.out.println(ybe.getMessage());
        }

    }

}
