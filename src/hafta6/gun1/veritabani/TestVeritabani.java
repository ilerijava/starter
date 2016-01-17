package hafta6.gun1.veritabani;

import java.util.ArrayList;

public class TestVeritabani {

    public static void main(String[] args) {

        Veritabani vt = new Veritabani("com.mysql.jdbc.Driver",
                "jdbc:mysql://127.0.0.1:3306", "root", "root", "temel");
        vt.VtCalistir();
        kullaniciListele(vt);
        /*
        Kullanici k = new Kullanici("Mahmut", "Acar", "mc", "mc123");
        boolean eklendiMi = vt.kullaniciEkle(k);
        if (eklendiMi) {
            System.out.println("--> kullanıcı eklendi");
        }

        kullaniciListele(vt);
         *//*
        Kullanici k1 = vt.kullaniciGetirById(1);
        if (k1 != null) {
            System.out.println("");
            System.out.println(k1);
            System.out.println("");
            k1.setKullaniciAdi("ahmetdemir");
            k1.setSifre("123");
            boolean guncellendiMi = vt.kullaniciGuncelle(k1);
            if (guncellendiMi) {
                System.out.println("");
                System.out.println(k1);
                System.out.println("");
            } else {
                System.out.println("Güncellenecek veri yok");
            }
        } else {
            System.out.println("Aradığınız kullanıcı yok");
        }
        System.out.println("");*/

        Kullanici k2 = vt.kullaniciGetirById(6);
        if (k2 != null) {
            boolean silindiMi = vt.kullaniciSil(k2);
            if (silindiMi) {
                System.out.println("silme işlemi başarılı");
            } else {
                System.out.println("silme işlemi başarısız");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            kullaniciListele(vt);
        } else {
            System.out.println("Aradığınız kullanıcı yok");
        }
    }

    private static void kullaniciListele(Veritabani vt) {
        ArrayList<Kullanici> kullanicilar = vt.kullanicilariGetir();
        for (Kullanici kullanici : kullanicilar) {
            System.out.println(kullanici);
        }
    }

}
