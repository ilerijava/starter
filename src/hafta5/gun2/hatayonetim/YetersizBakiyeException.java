package hafta5.gun2.hatayonetim;

public class YetersizBakiyeException extends Exception {

    private double fark;

    public YetersizBakiyeException(double fark) {
        this.fark = fark;
    }

    @Override
    public String getMessage() {
        return fark + " TL fazla para çekmeye çalışıyorsunuz";
    }

}
