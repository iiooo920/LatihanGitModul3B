package after_refactoring;

public class Game {
    // 6. Move Method: main() dipindahkan ke sini
    public static void main(String[] args) {
        VirtualPet myPet = new VirtualPet("Kucing Oren");
        myPet.feed();
        myPet.play();
        myPet.displayStatus();
    }
}