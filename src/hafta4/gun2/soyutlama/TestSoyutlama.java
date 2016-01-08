package hafta4.gun2.soyutlama;

public class TestSoyutlama {

    public static void main(String[] args) {

        Kare kare = new Kare(5, "mavi", true);
        Dikdortgen dikdortgen = new Dikdortgen(5, 10, "pembe", true);
        GeometrikSekil gs1 = new Kare(15, "siyah", false);
        GeometrikSekil gs2 = new Dikdortgen(20, 30, "kırmızı", true);
        ekranaYazdir(kare);
        ekranaYazdir(dikdortgen);
        ekranaYazdir(gs1);
        ekranaYazdir(gs2);

    }

    public static void ekranaYazdir(GeometrikSekil gs) {
        System.out.println(gs);
        System.out.println("cevre : " + gs.cevreHesapla());
        System.out.println("alan : " + gs.alanHesapla());
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

}
