package hafta3.gun2;

/**
 * StringOrnekleri2 sınıfı equals(), equalsIgnoreCase(), compareTo(),
 * compareToIgnoreCase() metodlarının kullanımını anlatır.
 */
public class StringOrnekleri2 {

    public static void main(String[] args) {
        /**
         * equals = İki String ifadenin eşit olup olmadığının karşılaştırılması
         */
        String str1 = "Temel Java";
        String str2 = "Temel Java";
        String str3 = new String("Temel Java");

        boolean esitMi = str1 == str2;
        System.out.println("esitMi " + esitMi);
        boolean esitMi2 = str2 == str3;
        System.out.println("esitMi2 " + esitMi2);

        boolean equals = str1.equals(str2);
        System.out.println("equals " + equals);
        boolean equals2 = str2.equals(str3);
        System.out.println("equals2 " + equals2);

        /**
         * equalsIgnoreCase = equals metodunun yaptığı işi büyük küçük harf
         * ayrımı olmadan yapar.
         */
        String str4 = "Temel java";
        boolean equals1 = str2.equals(str4);
        System.out.println("equals1 " + equals1);
        boolean equalsIgnoreCase = str2.equalsIgnoreCase(str4);
        System.out.println("equalsIgnoreCase " + equalsIgnoreCase);

        /*
         * compareTo = İki String ifadenin sözlük sırasına göre karşılaştırılması
         * sonuç == 0 ise s1 ve s2 birbirine eşit
         * sonuç < 0  ise sözlükte s1 önce gelir s2 sonra gelir
         * sonuç > 0  ise sözlükte s2 önce gelir s1 sonra gelir
         */
        String strA = "Ali";
        String strB = "Hasan";
        String strC = "Veli";
        int compareTo1 = strA.compareTo(strB);
        int compareTo2 = strC.compareTo(strB);
        System.out.println("compareTo1 " + compareTo1);
        System.out.println("compareTo2 " + compareTo2);

        /**
         * compareToIgnoreCase = compareTo metodunun yaptığı işi büyük küçük
         * harf ayrımı olmadan yapar.
         */
        String strD = "HASAN";
        int compareTo3 = strB.compareTo(strD);
        System.out.println("compareTo3 " + compareTo3);
        int compareToIgnoreCase = strB.compareToIgnoreCase(strD);
        System.out.println("compareToIgnoreCase " + compareToIgnoreCase);
    }
}
