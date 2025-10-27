package after_refactoring;
/**
 * Kelas utama yang berfungsi sebagai titik masuk (entry point) untuk menjalankan
 * simulasi interaksi dengan Peliharaan Virtual
 */
public class Game {
    // 6. Move Method: main() dipindahkan ke sini
    public static void main(String[] args) {
        VirtualPet myPet = new VirtualPet("Kucing Oren");
        myPet.feed();
        myPet.play();
        myPet.displayStatus();
    }
}