package hafta3.gun1;

import java.util.Scanner;
/**
 * TestDizi sınıfı
 */
public class TestDizi {

    public static void main(String[] args) {
        int diziBoyutu = 15;
        String adDizi[] = new String[diziBoyutu];
        String soyadDizi[] = new String[diziBoyutu];

        Scanner input = new Scanner(System.in);

        System.out.println("0-> Çıkış\n1->Öğrenci Ekle\n2->Öğrenci Sil"
                + "\n3->Öğrencileri Listele");

        int cevap;
        int index = 0;
        do {
            System.out.print("Lütfen işlem yapınız : ");
            cevap = input.nextInt();

            if (cevap == 0) {
                System.out.println("Çıkış yaptınız");
                break;
            } else if (cevap == 1) {
                System.out.print("Öğrenci Adı : ");
                String ad = input.next();
                adDizi[index] = ad;
                System.out.print("Öğrenci Soyadı : ");
                String soyad = input.next();
                soyadDizi[index] = soyad;
                index++;
                System.out.println(ad + " " + soyad + " listeye eklendi");
            } else if (cevap == 2) {
                System.out.print("Silmek istediğiniz index noyu giriniz : ");
                int no = input.nextInt();
                System.out.println(adDizi[no] + " " + soyadDizi[no]
                        + " isimli öğrenci silindi");
                adDizi[no] = null;
                soyadDizi[no] = null;
            } else if (cevap == 3) {
                int sayac = 0;
                for (int i = 0; i < diziBoyutu; i++) {
                    if (adDizi[i] != null) {
                        System.out.println(i + ". " + adDizi[i] + " "
                                + soyadDizi[i]);
                        sayac++;
                    }
                }
                if (sayac == 0) {
                    System.out.println("Listede öğrenci yok");
                }
            } else {
                System.out.println("Yanlış işlem tipi");
            }
        } while (cevap != 0);
    }

}
