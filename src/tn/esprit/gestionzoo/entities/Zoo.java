package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    private static final int MAX_ANIMALS = 25;   // Capacité maximale du zoo
    private static final int MAX_AQUATIC = 10;   // Capacité maximale animaux aquatiques

    private String name;
    private String city;
    private Animal[] animals = new Animal[MAX_ANIMALS];
    private Aquatic[] aquaticAnimals = new Aquatic[MAX_AQUATIC];
    private int animalCount = 0;
    private int aquaticCount = 0;

    // Constructeurs
    public Zoo(String name, String city, int nbrCages) {
        this.name = (name == null || name.isEmpty()) ? "Zoo inconnu" : name;
        this.city = city;
    }

    public Zoo() {
        this("Zoo inconnu", "Ville inconnue", 10);
    }

    // Getters
    public String getName() { return name; }
    public String getCity() { return city; }
    public int getAnimalCount() { return animalCount; }
    public int getAquaticCount() { return aquaticCount; }

    // Ajouter un animal général
    public boolean addAnimal(Animal animal) {
        if (animal == null) return false;
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo !");
            return false;
        }
        if (animalCount >= MAX_ANIMALS) {
            System.out.println("Le zoo est plein !");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;

        if (animal instanceof Aquatic) {
            addAquaticAnimal((Aquatic) animal);
        }
        return true;
    }

    // Ajouter un animal aquatique
    public boolean addAquaticAnimal(Aquatic aquatic) {
        if (aquatic == null) return false;
        if (aquaticCount >= MAX_AQUATIC) {
            System.out.println("Le zoo aquatique est plein !");
            return false;
        }
        aquaticAnimals[aquaticCount] = aquatic;
        aquaticCount++;
        return true;
    }

    // Afficher tous les animaux
    public void displayAnimals() {
        System.out.println("Animaux terrestres et aquatiques : " + Arrays.toString(Arrays.copyOf(animals, animalCount)));
        System.out.println("Animaux aquatiques : " + Arrays.toString(Arrays.copyOf(aquaticAnimals, aquaticCount)));
    }

    // Afficher swim() de tous les animaux aquatiques
    public void swimAllAquatic() {
        System.out.println("--- Tous les animaux aquatiques nagent ---");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // Chercher un animal par nom
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) return i;
        }
        return -1;
    }


    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;

        // Décaler les animaux
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;

        // Décaler les aquatiques si nécessaire
        if (animal instanceof Aquatic) {
            for (int i = 0; i < aquaticCount; i++) {
                if (aquaticAnimals[i].getName().equals(animal.getName())) {
                    for (int j = i; j < aquaticCount - 1; j++) {
                        aquaticAnimals[j] = aquaticAnimals[j + 1];
                    }
                    aquaticAnimals[aquaticCount - 1] = null;
                    aquaticCount--;
                    break;
                }
            }
        }

        return true;
    }

    // Vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= MAX_ANIMALS;
    }

    // Comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount >= z2.animalCount ? z1 : z2;
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maxDepth;

    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphinCount++;
            else if (aquaticAnimals[i] instanceof Penguin) penguinCount++;
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }
}
