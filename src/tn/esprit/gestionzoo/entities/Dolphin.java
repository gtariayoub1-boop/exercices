package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin() {
        super("Delphinidae", "Inconnu", 0, true, "Océan");
        this.swimmingSpeed = 0f;
    }

    public Dolphin(String name, int age, float swimmingSpeed) {
        super("Delphinidae", name, age, true, "Océan");
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() { return swimmingSpeed; }
    public void setSwimmingSpeed(float swimmingSpeed) { this.swimmingSpeed = swimmingSpeed; }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }


    @Override
    public String toString() {
        return "Dolphin{" +
                "name='" + getName() + '\'' +
                ", family='" + getFamily() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", habitat='" + getHabitat() + '\'' +
                ", swimmingSpeed=" + swimmingSpeed +
                " km/h}";
    }
}
