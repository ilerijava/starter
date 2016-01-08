package hafta2.gun1;

import java.util.Scanner;

/**
 * HesapMakinasi sınıfı kullanıcıdan iki double değer alarak kullnıcının girmiş
 * olduğu operatöre göre işlem yapar, sonucunu kullanıcıya göndürür.
 */
public class HesapMakinasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        double d1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double d2 = input.nextDouble();
        System.out.print("Operatörü giriniz : ");
        String operator = input.next();

        if (operator.equals("+")) {
            System.out.println(d1 + d2);
        } else if (operator.equals("-")) {
            System.out.println(1 - d2);
        } else if (operator.equals("*")) {
            System.out.println(d1 * d2);
        } else if (operator.equals("/")) {
            System.out.println(d1 / d2);
        } else if (operator.equals("%")) {
            System.out.println(d1 % d2);
        } else {
            System.out.println("Geçersiz işlem");
        }

        /**
         * switch, if-else yapısı gibi bir kontorl ifadesidir. Konrol edilecek 
         * koşulların belli olduğu durumlarda durumlar kullanılır.
         * 
         * Switch bloğu ile yukarıda bulunan if-else bloğu aynı işlemi 
         * yapmaktadır.
         */
        switch (operator) {
            case "+": System.out.println(d1 + d2); break;
            case "-": System.out.println(d1 - d2); break;
            case "*": System.out.println(d1 * d2); break;
            case "/": System.out.println(d1 / d2); break;
            case "%": System.out.println(d1 % d2); break;
            default : System.out.println("Geçersiz işlem");
        }

    }

}
