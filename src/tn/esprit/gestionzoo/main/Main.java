package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        // Création d'un zoo
        Zoo zoo = new Zoo("Zoo de Lyon", "Lyon", 10);

        // Création d'animaux aquatiques
        Aquatic fish = new Aquatic("FishFamily", "Nemo", 1, false, "Ocean") {
            @Override
            public void swim() {
                System.out.println("This aquatic animal is swimming.");
            }
        };
        Dolphin dolphin1 = new Dolphin("Flipper", 6, 35.5f);
        Penguin penguin1 = new Penguin("Pingu", 3, 15f);
        Penguin penguin2 = new Penguin("Pingu2", 4, 18f);

        // Ajout des animaux aquatiques dans le zoo
        zoo.addAnimal(fish);
        zoo.addAnimal(dolphin1);
        zoo.addAnimal(penguin1);
        zoo.addAnimal(penguin2);

        // Affichage des animaux aquatiques
        System.out.println("\n--- Animaux aquatiques du zoo ---");
        zoo.displayAnimals();

        // Test swim() pour tous les aquatiques
        System.out.println("\n--- Tous les animaux aquatiques nagent ---");
        zoo.swimAllAquatic();

        // Test profondeur max des pingouins
        float maxDepth = zoo.maxPenguinSwimmingDepth();
        System.out.println("\nProfondeur maximale des pingouins : " + maxDepth + " mètres");

        // Test nombre de dauphins et pingouins
        System.out.println("\n--- Nombre d'animaux aquatiques par type ---");
        zoo.displayNumberOfAquaticsByType();

        // Test equals() pour aquatiques
        System.out.println("\n--- Test equals() pour les aquatiques ---");
        Penguin penguinTest = new Penguin("Pingu", 3, 15f);
        System.out.println("penguin1.equals(penguinTest) ? " + penguin1.equals(penguinTest));

        Dolphin dolphinTest = new Dolphin("Flipper", 6, 35.5f);
        System.out.println("dolphin1.equals(dolphinTest) ? " + dolphin1.equals(dolphinTest));

        // Suppression d’un animal aquatique
        System.out.println("\n--- Suppression d’un animal aquatique ---");
        zoo.removeAnimal(dolphin1);
        zoo.displayAnimals();

        // Comparaison avec un autre zoo
        Zoo zoo2 = new Zoo("Zoo de Paris", "Paris", 12);
        zoo2.addAnimal(new Penguin("Pengy", 2, 10f));
        zoo2.addAnimal(new Dolphin("Dolly", 4, 30f));

        Zoo zooPlusPeuple = Zoo.comparerZoo(zoo, zoo2);
        System.out.println("\nLe zoo le plus peuplé est : " + zooPlusPeuple.getName() +
                " avec " + zooPlusPeuple.getAnimalCount() + " animaux.");
    }
}
