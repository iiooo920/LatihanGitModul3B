package after_refactoring;

public abstract class LivingThing {
    // 1. Encapsulate Field: Atribut menjadi private
    private String name;

    public LivingThing(String name) {
        this.name = name;
    }

    // Getter untuk atribut private
    public String getName() {
        return name;
    }
}