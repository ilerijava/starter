package hafta2.gun2;

/*
 * BreakContinue sınıfı, döngüleri kontrol etmek için kullnılan break ve
 * continue ifadelerine dair örnekleri içerir. 
 * break : çalıştığında döngünün çalışmasını bitirilir ve döngüden çıkılır. 
 * continue : çalıştığında döngünün o  adımı atlanır ve döngü çalışmaya devam eder.
 */
public class BreakContinue {

    public static void main(String[] args) {
        System.out.println("break");
        System.out.println("");

        /**
         * 6 değeri geldiğinde döngüden çıkılır.
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i > 5) {
                break;
            }
        }

        System.out.println("");
        System.out.println("continue");
        System.out.println("");

        /**
         * 5'ten sonraki değerler ekrana yazdırılmaz.
         */
        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("");

        /**
         * 3'e bölünmeyen değerleri ekrana bastırmaz.
         */
        for (int i = 0; i < 10; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }

    }

}
