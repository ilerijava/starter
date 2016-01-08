package hafta4.gun2.statics;

public class TestStatic2 {

    public static void main(String[] args) {
        /**
         * static metot ve özelliklere ise sınıftan nesne oluşturulmadan da
         * erişilebilir.
         */
        TestStatic.main(null);

        double d = StaticSinif.oran;
        System.out.println(d);

    }

}
