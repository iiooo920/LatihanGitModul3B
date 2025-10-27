package after_refactoring;

/**
 * Kelas abstrak yang merepresentasikan makhluk hidup dasar
 * Kelas ini menyediakan properti dasar seperti nama
 */
public abstract class LivingThing {
    // 1. Encapsulate Field: Atribut menjadi private
    private String name;

    /**
     * Constructor untuk membuat objek LivingThing baru.
     * @param name Nama yang akan diberikan kepada makhluk hidup ini
     */
    public LivingThing(String name) {
        this.name = name;
    }

    /**
     * Mengambil (mendapatkan) nama dari makhluk hidup ini
     * @return Nama makhluk hidup sebagai String
     */
    public String getName() {
        return name;
    }
}