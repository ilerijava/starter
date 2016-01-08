package hafta2.gun1;

/**
 * IfElseIf sınıfı, kontrol ifadelerinde birden fazla if-else yapısının nasıl
 * kullanılacağına dair örnek içeriri.
 */
public class IfElseIf {

    public static void main(String[] args) {

        int not = 70;

        if (not >= 90) {
            System.out.println("A");
        } else if (not >= 80) {
            System.out.println("B");
        } else if (not >= 70) {
            System.out.println("C");
        } else if (not >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
