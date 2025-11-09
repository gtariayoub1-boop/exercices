package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String name, int age, float swimmingDepth) {
        super("Spheniscidae", name, age, false, "Antarctica");
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() { return swimmingDepth; }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
}
