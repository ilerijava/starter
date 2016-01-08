package hafta3.gun1;

import java.util.Scanner;

public class VKI4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cevap;
        do {
            double boy = degerAl("Lütfen boyunuzu(m) giriniz : ", input);
            double kilo = degerAl("Lütfen kilonuzu(kg) giriniz : ", input);
            double sonuc = formulHesapla(boy, kilo);
            if (sonuc < 18.5) {
                ekranaYazdir("Zayıf");
            } else if (sonuc < 24.9) {
                ekranaYazdir("Normal");
            } else if (sonuc < 29.9) {
                ekranaYazdir("Kilolu");
            } else {
                ekranaYazdir("Aşırı Kilolu");
            }
            cevap = (int) degerAl("Çıkmak için 0'a, devam etmek için 1'e basınız : ", input);
        } while (cevap != 0);
    }

    public static double degerAl(String ifade, Scanner s) {
        System.out.print(ifade);
        double d = s.nextDouble();
        return d;
    }

    public static double formulHesapla(double b, double k) {
        return k / Math.pow(b, 2);
    }

    public static void ekranaYazdir(String str) {
        System.out.println(str);
    }

}
