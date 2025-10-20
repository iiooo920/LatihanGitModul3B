public class VirtualPetBefore {
    public static final int HUNGER = 20;
    // Atribut dibuat public, melanggar enkapsulasi
    public String name;
    public int hunger;   // Tingkat lapar (0-100)
    public int happiness; // Tingkat senang (0-100)

    public VirtualPetBefore(String name) {
        this.name = name;
        this.hunger = 50;   // Nilai awal
        this.happiness = 50; // Nilai awal
    }

    // Method ini terlalu panjang dan melakukan banyak hal
    public void live() {
        // Logika memberi makan
        if (this.hunger > 30) {
            this.hunger -= 20; // Magic number
            System.out.println(this.name + " sudah diberi makan. Tingkat lapar berkurang!");
        } else {
            System.out.println(this.name + " tidak terlalu lapar.");
        };

        // Logika mengajak main
        if (this.happiness < 70) {
            this.happiness += HUNGER; // Magic number
            System.out.println(this.name + " senang diajak bermain!");
        } else {
            System.out.println(this.name + " sudah cukup senang.");
        }

        System.out.println("--- Status " + this.name + " ---");
        System.out.println("Lapar: " + this.hunger);
        System.out.println("Senang: " + this.happiness);
    }

    private void extracted() {
        if (this.hunger > 30) {
            this.hunger -= 20; // Magic number
            System.out.println(this.name + " sudah diberi makan. Tingkat lapar berkurang!");
        } else {
            System.out.println(this.name + " tidak terlalu lapar.");
        }
    }

    // Main method digabung dengan kelas data
    public static void main(String[] args) {
        VirtualPetBefore myPet = new VirtualPetBefore("Kucing Oren");
        myPet.live();
    }
}