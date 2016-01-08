package hafta2.gun1;

import java.util.Scanner;

/*
 * switch, if-else yapısı gibi bir kontorl ifadesidir. Konrol edilecek 
 * koşulların belli olduğu durumlarda durumlar kullanılır.
 */

public class SwitchTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Bugün haftanın kaçıncı günü : ");
        int day = input.nextInt();
        String dayString;

        switch (day) {
            case 1:  dayString = "Pazartesi";
                     break;
            case 2:  dayString = "Salı";
                     break;
            case 3:  dayString = "Çarşamba";
                     break;
            case 4:  dayString = "Perşembe";
                     break;
            case 5:  dayString = "Cuma";
                     break;
            case 6:  dayString = "Cumartesi";
                     break;
            case 7:  dayString = "Pazar";
                     break;
            default: dayString = "Geçersiz gün";
                     break;
        }
        System.out.println("Bugün günlerden "+dayString);
    }

}
