package hafta4.gun2;

import java.util.Scanner;

public class TestVKI5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu(kg) giriniz : ");
        String kilo = input.next();
        System.out.print("Lütfen boyunuzu(m) giriniz : ");
        String boy = input.next();
        boy = boy.replace(",", ".");
        kilo = kilo.replace(",", ".");
        double dblBoy = Double.parseDouble(boy);
        double dblKilo = Double.parseDouble(kilo);

        if(dblBoy <= 0.0 || dblKilo <= 0.0){
            System.out.println("hatalı veri");
            return;
        }
        
        VKI5 vki5 = new VKI5(dblBoy, dblKilo);
        vki5.formulHesapla();
        String sonuc = vki5.degenlendir();
        /*
        System.out.println("boy : " + vki5.getBoy());
        System.out.println("kilo : " + vki5.getKilo());*/
        System.out.println(vki5);
        System.out.printf("sonuc : %4.2f", vki5.getSonuc());
        System.out.println("\nDeğerlendirme sonucuna göre \"" + sonuc + "\" görünüyorsunuz");

    }

}
