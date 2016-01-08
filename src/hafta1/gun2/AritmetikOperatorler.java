package hafta1.gun2;
/*
 * AritmetikOperatorleri sınıfı 
 * toplama(+), 
 * çıkarma(-), 
 * çarpma(*), 
 * bölme(/),
 * mod alma(%)
 * önce artırma(++Değişken)
 * sonra artırma(Değişken++)
 * önce azaltma(--Değişken)
 * sonra azaltma(Değişken--)
 * operatörlerini içerir.
 */

public class AritmetikOperatorler {

    public static void main(String args[]) {

        int i = 10;
        int j = 12;

        //toplama(+) operatörü
        int toplam = i + j;
        System.out.println(toplam);

        //çıkarma(-) operatörü
        int fark = i - j;
        System.out.println(fark);

        //çarpma(*) operatörü
        int carpma = i * j;
        System.out.println(carpma);

        //bölme(/) operatörü
        double bolme1 = i / (double) j;
        double bolme2 = j / (double) i;
        System.out.println(bolme1);
        System.out.println(bolme2);

        //mod alma(%) operatörü
        int mod1 = i % j;
        int mod2 = j % i;
        System.out.println(mod1);
        System.out.println(mod2);

        /*
         * İşlem Önceliği 
         * 1) Parantez 
         * 2) Çarpma, Bölme 
         * 3) Toplama,Çıkartma
         */
        int islem1 = 12 * (3 + 4);
        System.out.println(islem1);

        /*
         * Eşdeğerde iki operatörden eşittire daha yakın olan (ya da daha solda olan)
         * operatör diğer operatöre göre daha önceliklidir.
         * Önce o operatör işleme girer, daha sonra sağındaki operatör işleme girer.
         */
        double islem2 = 12.0 / 5 * 2;
        System.out.println(islem2);

        /*
         * Değişken++
         * Önce işlem yaptır, sonra değerini artır.
         * Post Increment
         */
        int y = 100;
        System.out.println(y);
        int islem3 = 20 + y++;
        System.out.println(islem3);
        System.out.println(y);

        /*
         * ++Değişken
         * Önce değerini artır, sonra işlem yaptır.
         * Pre Increment
         */
        int z = 200;
        System.out.println(z);
        int islem4 = 20 + ++z;
        System.out.println(islem4);
        System.out.println(z);

        /*
         * Değişken--
         * Önce işlem yaptır, sonra değerini azalt.
         * Post Decrement
         */
        int a = 1;
        System.out.println(a);
        int islem5 = 20 * a--;
        System.out.println(islem5);
        System.out.println(a);

        /*
         * --Değişken
         * Önce değerini azalt, sonra işlem yaptır.
         * Pre Decrement
         */
        int b = 1;
        System.out.println(b);
        int islem6 = 20 * --b;
        System.out.println(islem6);
        System.out.println(b);

        /**
         * Örnek
         */
        int sayac = 1;
        System.out.println(sayac++);//1
        System.out.println(sayac--);// 2 
        System.out.println(++sayac);//2 
        System.out.println(--sayac);//1
        System.out.println(sayac--);//1
        System.out.println(sayac);//0

        i = i + 20;
        i += 20;//Toplama işleminin kısaltılmış halidir.
        System.out.println(i);

        i = i - 40;
        i -= 40;//Çıkartma işleminin kısaltılmış halidir.
        System.out.println(i);

        i = i * 100;
        i *= 100;//Çarpma işleminin kısaltılmış halidir.
        System.out.println(i);

        i /= 10;
        i = i / 10;//Bölme işleminin kısaltılmış halidir.
        System.out.println(i);

        i = i % 11;
        i %= 11;//Mod alma işleminin kısaltılmış halidir.
        System.out.println(i);

    }

}
