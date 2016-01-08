package hafta3.gun2;

/**
 * TV sınıfı
 */
public class TV {

    int kanal;
    int ses;
    double inc;

    public TV() {
        System.out.println("önce ben");
    }

    void kanalIlerle() {
        kanal++;
    }

    void kanalGeriGit() {
        kanal--;
    }

    void kanalaGit(int i) {
        kanal = i;
    }

    void sesArtir() {
        ses++;
    }

    void sesAzalt() {
        ses--;
    }

}
