package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String name, int age, float swimmingSpeed) {
        super("Delphinidae", name, age, true, "Ocean");
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() { return swimmingSpeed; }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }
}
