package hafta3.gun2;

import java.util.Locale;

public class StringOrnekleri {

    public static void main(String[] args) {

        String str = "Merhaba Java";
        String s = new String("Merhaba Java");

        boolean ayniMi = str == s;
        System.out.println("ayniMi " + ayniMi);

        boolean ayniMi2 = str.equals(s);
        System.out.println("ayniMi2 " + ayniMi2);

        String str2 = "Merhaba java";

        boolean ayniMi3 = str.equals(str2);
        System.out.println("ayniMi3 " + ayniMi3);

        boolean ayniMi4 = str.equalsIgnoreCase(str2);
        System.out.println("ayniMi4 " + ayniMi4);

        String s1 = "Ali";
        String s2 = "Hasan";
        String s3 = "Veli";
        String s4 = "veli";

        int compareTo1 = s1.compareTo(s2);
        System.out.println("compareTo1 " + compareTo1);

        int compareTo2 = s3.compareTo(s2);
        System.out.println("compareTo2 " + compareTo2);

        int compareTo3 = s4.compareTo(s3);
        System.out.println("compareTo3 " + compareTo3);

        int compareTo4 = s4.compareToIgnoreCase(s3);
        System.out.println("compareTo4 " + compareTo4);

        String toUpperCase = s1.toUpperCase(Locale.US);
        System.out.println("toUpperCase " + toUpperCase);

        String toLowerCase = toUpperCase.toLowerCase();
        System.out.println("toLowerCase " + toLowerCase);

        char charAt = str.charAt(8);
        System.out.println("charAt " + charAt);
        char charAt1 = str.charAt(7);
        System.out.println("charAt1" + charAt1);
        char charAt2 = str.charAt(2);//ch[25]
        System.out.println("charAt2 " + charAt2);

        int indexOf1 = str.indexOf('J');
        System.out.println("indexOf1 " + indexOf1);
        int indexOf2 = str.indexOf(74);
        System.out.println("indexOf2 " + indexOf2);
        int indexOf3 = str.indexOf("Java");
        System.out.println("indexOf3 " + indexOf3);
        int indexOf4 = str.indexOf(" J");
        System.out.println("indexOf4 " + indexOf4);
        int indexOf5 = str.indexOf("Java", 10);
        System.out.println("indexOf5 " + indexOf5);
        int indexOf6 = str.indexOf("java");
        System.out.println("indexOf6 " + indexOf6);

        int length = str.length();
        System.out.println("length " + length);

        String concat = str.concat(str2);
        System.out.println("concat " + concat);
        String concat2 = str + str2;
        System.out.println("concat2 " + concat2);

        String substring1 = str.substring(4);
        System.out.println("substring1 " + substring1);
        String substring2 = str.substring(4, 9);
        System.out.println("substring2 " + substring2);
        String substring3 = str.substring(4, 4);
        System.out.println("substring3 " + substring3);
        String substring4 = str.substring(9, 9);
        System.out.println("substring4 " + substring4);

        String replace1 = str.replace("a", "e");
        System.out.println("replace1 " + replace1);
        String replace2 = str.replace(" ", "?");
        System.out.println("replace2 " + replace2);
        String replace3 = str.replace('a', 'J');
        System.out.println("replace3 " + replace3);
        String replaceAll1 = str.replaceAll("\\w", "1");
        System.out.println("replaceAll1 " + replaceAll1);
        String str3 = "    Merhaba     Java     1";
        String replaceAll2 = str3.replaceAll("\\s", "");
        System.out.println("replaceAll2 " + replaceAll2);

        String[] split1 = str.split("a");
        for (String split11 : split1) {
            System.out.print(split11 + " ");
        }
        System.out.println("--------------------");
        String[] split = str3.split("\\w");
        for (int i = 0; i < split.length; i++) {
            System.out.println(i + " " + split[i]);
        }

        String telno = "0312 345 67 89";
        boolean matches = telno.matches("[0]\\d{3}\\s\\d{3}\\s\\d{2}\\s\\d{2}");
        System.out.println("matches " + matches);

        char[] chArray = str.toCharArray();
        for (char c : chArray) {
            System.out.println(c);
        }

        for (int i = 0; i < chArray.length; i++) {
            System.out.println(i + " " + chArray[i]);
        }

        String chStr = new String(chArray);
        System.out.println(chStr);
    }

}
