package hafta2.gun1;

/**
 * IcIceIfElse sınıfı iç içe yazılan if(nested if) yapılarına dair örnek içerir.
 * Birden fazla koşulun olduğu durumlarda iç içe if-else yazılarak kod
 * yardımıyla kontroller yapılabilir.
 */
public class IcIceIfElse {

    public static void main(String[] args) {

        int not = 70;

        if (not >= 90) {
            System.out.println("Çok Başarılı");
            System.out.println("1. oldun");
        } else {
            System.out.println("1.liği kaçırdın");
            if (not >= 80) {
                System.out.println("Başarılı");
            } else {
                if (not >= 70) {
                    System.out.println("İyi");
                } else {
                    if (not >= 60) {
                        System.out.println("İdare eder");
                    } else {
                        System.out.println("Başarısız");
                    }
                }
            }
        }
    }
}
