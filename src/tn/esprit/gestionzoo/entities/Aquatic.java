package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() { return habitat; }

    // Méthode abstraite : doit être redéfinie dans toutes les classes filles
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                  // même référence
        if (obj == null || getClass() != obj.getClass()) return false; // types différents

        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }
}
