package hafta3.gun2;

public class NesneUretimi {

    public static void main(String[] args) {

        Sinif nesne1 = new Sinif();
        Sinif nesne2 = new Sinif();
        Sinif nesne3 = new Sinif();
        Sinif nesne4 = new Sinif();

        System.out.println(nesne1 == nesne2);

        TV yumatu1 = new TV();
        yumatu1.kanalaGit(100);

        yumatu1.sesAzalt();
        yumatu1.sesAzalt();
        yumatu1.sesAzalt();
        Daire d1 = new Daire();
        d1.yaricap = 5.5;
        double cevre = d1.cevreHesapla();
        double alan = d1.alanHesapla();
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

        Daire d2 = new Daire();
        d2.yaricap = 5.5;

        System.out.println(d1 == d2);
        Daire d3 = new Daire(10.5);
        System.out.println("yaricap = " + d3.yaricap);
        System.out.println("cevre = " + d3.cevreHesapla());
        System.out.println("alan = " + d3.alanHesapla());

    }

}
