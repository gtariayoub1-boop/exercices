package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin() {
        super("Spheniscidae", "Inconnu", 0, false, "Mer/Glace");
        this.swimmingDepth = 0f;
    }

    public Penguin(String name, int age, float swimmingDepth) {
        super("Spheniscidae", name, age, false, "Mer/Glace");
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() { return swimmingDepth; }
    public void setSwimmingDepth(float swimmingDepth) { this.swimmingDepth = swimmingDepth; }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + getName() + '\'' +
                ", family='" + getFamily() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", habitat='" + getHabitat() + '\'' +
                ", swimmingDepth=" + swimmingDepth +
                " m}";
    }
}
