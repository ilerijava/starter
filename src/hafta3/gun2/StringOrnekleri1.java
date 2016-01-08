package hafta3.gun2;

import java.util.Locale;

public class StringOrnekleri1 {

    public static void main(String[] args) {

        /*
         * length -> Stringin uzunluğunu verir.
         */
        String uzunluk = "Java Temel Eğitimi";
        System.out.println("uzunluk " + uzunluk.length());

        /*
         * charAt -> String ifadesinden index numarası verilen karakteri verir.
         * Index 0 ile str.length()-1 arasındadır.
         */
        System.out.println("charAt(5)" + uzunluk.charAt(5));

        String str1 = "birinci";
        String str2 = "ikinci";

        /**
         * concatenate -> İki String ifadesini birbirine bağlar.
         */
        System.out.println("concat "
                + str1.concat(str2).concat("üçüncü"));

        /**
         * substring -> String ifadesinin belli bir kısmını verir.
         */
        String substring = "Java Temel Eğitimi";
        System.out.println("substring " + substring.substring(7));
        System.out.println("substring " + substring.substring(7, 15));

        /**
         * toLowerCase -> Bütün harfleri küçük harfe çevirir.
         */
        System.out.println("YAZI".toLowerCase());
        System.out.println("YAZI".toLowerCase(Locale.US));

        /**
         * toUpperCase -> Bütün harfleri büyük harfe çevirir.
         */
        String str4 = "küçük harfli yazı".toUpperCase();
        String str5 = "küçük harfli yazı".toUpperCase(Locale.FRENCH);
        System.out.println("str4 " + str4);
        System.out.println("str5 " + str5);

        /**
         * trim -> String ifadenin sağ ve sol tarafındaki boşlukları alır.
         */
        String str7 = " Boşluklu bir ifade ";
        System.out.println("trim" + str7 + "trim");
        System.out.println("trim" + str7.trim() + "trim");

        /*
         * replace -> String ifade içerisindeki bütün karakterleri
         * eşleşen karakterle değiştirir.
         */
        String orjinal = "Merhaba Java 2015";
        System.out.println("orjinal " + orjinal);
        System.out.println("replace " + orjinal.replace('a', 'e'));
        System.out.println("replace " + orjinal.replace("2", "i"));
        System.out.println("replaceFirst " + orjinal.replaceFirst("a", "i"));
        System.out.println("replaceAll " + orjinal.replaceAll("2", "i"));
        System.out.println("replaceAll " + orjinal.replaceAll("\\d", "i"));
        System.out.println("replaceAll " + orjinal.replaceAll("\\s", "8"));

        String str123 = "Bu ifadeyi böl";
        String[] strDizi = str123.split("i");
        for (String strDizi1 : strDizi) {
            System.out.println(strDizi1);
        }

        for (int i = 0; i < strDizi.length; i++) {
            String strDizi1 = strDizi[i];
            System.out.println(i + " " + strDizi1);
        }

        /*
         * indexOf -> String ifadesinde geçen karakter veya string parçasının
         * başlangıç indeksini döndürür. Eğer yoksa -1 döndürür.
         */
        String indexOrnegi = "Merhaba Java";
        System.out.println("e " + indexOrnegi.indexOf("e"));
        System.out.println("e-3 " + indexOrnegi.indexOf("e", 3));
        System.out.println("a " + indexOrnegi.indexOf("a"));
        System.out.println("a-5 " + indexOrnegi.indexOf("a", 5));
        System.out.println("J " + indexOrnegi.indexOf('J'));
        System.out.println("Java " + indexOrnegi.indexOf("Java"));

        String containsStr = "Temel Java Dersi";
        System.out.println("contains " + containsStr.contains("Java"));

        String telNo = "505-741-45-96";
        boolean telMatches = telNo.matches("\\d{3}-\\d{3}-\\d{2}-\\d{2}");
        String kimlikNo = "12345678910";
        boolean kimlikMatches = kimlikNo.matches("\\d{11}");
        System.out.println("telMatches " + telMatches);
        System.out.println("kimlikMatches " + kimlikMatches);

        String str10 = "a+b$c#";
        System.out.println(str10 + "  " + str10.replaceAll("[$#+]", "444"));
    }

}
