package hafta4.gun1.kalitim;

import java.util.Scanner;

public class TestKullanici {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi = veriAl("Kullanıcı adı : ", input);
        String sifre = veriAl("Şifre : ", input);

        Kullanici k = new Kullanici();
        k.setKullaniciAdi(kullaniciAdi);
        k.setSifre(sifre);
        bilgileriEkranaYazdir(k);

        String eposta = veriAl("E-posta adresini güncelleyiniz : ", input);
        k.setEposta(eposta);
        bilgileriEkranaYazdir(k);

    }

    private static String veriAl(String ad, Scanner input) {
        System.out.print(ad);
        String kullaniciAdi = input.next();
        return kullaniciAdi;
    }

    private static void bilgileriEkranaYazdir(Kullanici k) {
        System.out.println("Kayıt başarılı");
        System.out.println("Kullanıcı Adı : " + k.getKullaniciAdi());
        System.out.println("şifre : " + k.getSifre());
        System.out.println("e-posta : " + k.getEposta());
    }

}
