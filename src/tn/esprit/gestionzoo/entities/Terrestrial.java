package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
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

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " is eating both meat and plants.");
        } else if (food == Food.MEAT) {
            eatMeat(food);
        } else if (food == Food.PLANT) {
            eatPlant(food);
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " is eating meat.");
        } else {
            System.out.println(getName() + " cannot eat meat.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " is eating plants.");
        } else {
            System.out.println(getName() + " cannot eat plants.");
        }


    }
}
