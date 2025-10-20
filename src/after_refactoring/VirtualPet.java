package after_refactoring;
// 5. Extract Superclass: Mewarisi dari LivingThing
public class VirtualPet extends LivingThing {
    // 1. Encapsulate Field: Atribut menjadi private
    private int hunger;
    private int happiness;

    // 3. Replace Magic Number: Angka diganti konstanta
    private static final int HUNGER_DECREASE = 20;
    private static final int HAPPINESS_INCREASE = 20;

    public VirtualPet(String name) {
        super(name);
        this.hunger = 50;
        this.happiness = 50;
    }

    // Getter
    public int getHunger() { return hunger; }
    public int getHappiness() { return happiness; }

    // 2. Extract Method: Logika memberi makan dipisah
    public void feed() {
        if (this.hunger > 30) {
            this.hunger -= HUNGER_DECREASE;
            System.out.println(getName() + " sudah diberi makan. Tingkat lapar berkurang!");
        } else {
            System.out.println(getName() + " tidak terlalu lapar.");
        }
    }

    // 2. Extract Method: Logika bermain dipisah
    public void play() {
        if (this.happiness < 70) {
            this.happiness += HAPPINESS_INCREASE;
            System.out.println(getName() + " senang diajak bermain!");
        } else {
            System.out.println(getName() + " sudah cukup senang.");
        }
    }

    // 4. Rename Method: 'live()' menjadi 'displayStatus()'
    public void displayStatus() {
        System.out.println("--- Status " + getName() + " ---");
        System.out.println("Lapar: " + this.hunger);
        System.out.println("Senang: " + this.happiness);
    }
}