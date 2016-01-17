package hafta6.gun1.veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Veritabani {

    private String surucu;
    private String adres;
    private String kullaniciAdi;
    private String sifre;
    private String veritabaniAdi;
    private Connection connection;

    public Veritabani(String surucu, String adres,
            String kullaniciAdi, String sifre, String veritabaniAdi) {
        this.surucu = surucu;
        this.adres = adres;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.veritabaniAdi = veritabaniAdi;
    }

    public void VtCalistir() {
        try {
            Class.forName(surucu);
            System.out.println("sürücü yüklendi");
            connection = DriverManager.getConnection(adres + "/" + veritabaniAdi,
                    kullaniciAdi, sifre);
            System.out.println("bağlantı kuruldu");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Kullanici> kullanicilariGetir() {
        ArrayList<Kullanici> kullaniciList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM kullanici";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String kullaniciAdi = rs.getString("kullaniciadi");
                String sifre = rs.getString("sifre");
                Kullanici kullanici = new Kullanici(id, ad, soyad, kullaniciAdi, sifre);
                kullaniciList.add(kullanici);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kullaniciList;
    }

    public Kullanici kullaniciGetirById(int id) {
        Kullanici kullanici = null;
        try {
            String sql = "SELECT * FROM kullanici WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String kullaniciAdi = rs.getString("kullaniciadi");
                String sifre = rs.getString("sifre");
                kullanici = new Kullanici(id, ad, soyad, kullaniciAdi, sifre);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kullanici;
    }

    public boolean kullaniciEkle(Kullanici k) {
        boolean eklendiMi = false;
        try {
            String sql = "INSERT INTO kullanici(ad, soyad, kullaniciadi, sifre)"
                    + " VALUES(?, ?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, k.getAd());
            ps.setString(2, k.getSoyad());
            ps.setString(3, k.getKullaniciAdi());
            ps.setString(4, k.getSifre());

            int sonuc = ps.executeUpdate();
            eklendiMi = sonuc != 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eklendiMi;
    }

    public boolean kullaniciGuncelle(Kullanici k) {
        boolean guncellendiMi = false;
        try {
            String sql = "UPDATE kullanici SET ad = ?, soyad = ?, kullaniciadi = ?,"
                    + "sifre = ? WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, k.getAd());
            ps.setString(2, k.getSoyad());
            ps.setString(3, k.getKullaniciAdi());
            ps.setString(4, k.getSifre());
            ps.setInt(5, k.getId());
            int sonuc = ps.executeUpdate();
            guncellendiMi = sonuc > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return guncellendiMi;
    }

    public boolean kullaniciSil(Kullanici k) {
        boolean silindiMi = false;
        try {
            String sql = "DELETE FROM kullanici WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, k.getId());
            int sonuc = ps.executeUpdate();
            return sonuc > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return silindiMi;
    }

    public Kullanici kullaniciGetir(Kullanici kullanici) {
        Kullanici k = null;
        try {
            String sql = "SELECT * FROM kullanici WHERE kullaniciadi = ? "
                    + " AND sifre = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, kullanici.getKullaniciAdi());
            ps.setString(2, kullanici.getSifre());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String kullaniciAdi = rs.getString("kullaniciadi");
                String sifre = rs.getString("sifre");
                k = new Kullanici(id, ad, soyad, kullaniciAdi, sifre);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;

    }

}
