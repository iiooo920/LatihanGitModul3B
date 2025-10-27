package after_refactoring;

/**
 * Merepresentasikan seekor peliharaan virtual yang memiliki tingkat lapar dan senang.
 * Peliharaan ini dapat diberi makan dan diajak bermain
 */
public class VirtualPet extends LivingThing {
    // 1. Encapsulate Field: Atribut menjadi private
    private int hunger;
    private int happiness;

    private static final int HUNGER_DECREASE = 20;
    private static final int HAPPINESS_INCREASE = 20;

    /**
     * Membuat objek VirtualPet baru
     * @param name Nama peliharaan
     */
    public VirtualPet(String name) {
        super(name);
        this.hunger = 50;
        this.happiness = 50;
    }

    // Getter
    public int getHunger() { return hunger; }
    public int getHappiness() { return happiness; }

    /**
     * Memberi makan peliharaan. Mengurangi tingkat lapar jika peliharaan lapar
     */
    public void feed() {
        if (this.hunger > 30) {
            this.hunger -= HUNGER_DECREASE;
            System.out.println(getName() + " sudah diberi makan. Tingkat lapar berkurang!");
        } else {
            System.out.println(getName() + " tidak terlalu lapar.");
        }
    }

    /**
     * Mengajak peliharaan bermain
     * Akan menambah tingkat senang jika peliharaan belum terlalu senang (happiness < 70).
     * Mencetak pesan status bermain ke konsol
     */
    public void play() {
        if (this.happiness < 70) {
            this.happiness += HAPPINESS_INCREASE;
            System.out.println(getName() + " senang diajak bermain!");
        } else {
            System.out.println(getName() + " sudah cukup senang.");
        }
    }

    /**
     * Menampilkan status terkini peliharaan (nama, lapar, senang) ke konsol
     */
    public void displayStatus() {
        System.out.println("--- Status " + getName() + " ---");
        System.out.println("Lapar: " + this.hunger);
        System.out.println("Senang: " + this.happiness);
    }
}