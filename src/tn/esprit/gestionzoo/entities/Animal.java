package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    // Getters et setters
    public String getFamily() { return family; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isMammal() { return isMammal; }

    public void setFamily(String family) { this.family = family; }
    public void setName(String name) { this.name = name; }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Erreur : un animal ne peut pas avoir un âge négatif !");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setMammal(boolean mammal) { isMammal = mammal; }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
