package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial() {
        super();
        this.nbrLegs = 4;
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() { return nbrLegs; }
    public void setNbrLegs(int nbrLegs) { this.nbrLegs = nbrLegs; }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "name='" + getName() + '\'' +
                ", family='" + getFamily() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", nbrLegs=" + nbrLegs +
                '}';
    }
}
