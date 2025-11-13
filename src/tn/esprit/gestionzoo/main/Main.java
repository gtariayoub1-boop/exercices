package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        // Création d'un zoo avec capacité de 5 animaux
        Zoo zoo = new Zoo("Petit Zoo", "Lyon", 5);

        // Création d'animaux
        Terrestrial lion = new Terrestrial("Felidae", "Simba", 5, true, 4);
        Dolphin dolphin1 = new Dolphin("Flipper", 6, 35.5f);
        Penguin penguin1 = new Penguin("Pingu", 3, 15f);
        Penguin penguin2 = new Penguin("Pingu2", -2, 18f); // âge négatif pour tester InvalidAgeException
        Penguin penguin3 = new Penguin("Pingu3", 4, 12f);

        System.out.println("\n--- Ajout des animaux ---");
        try {
            zoo.addAnimal(lion);       // OK
            zoo.addAnimal(dolphin1);   // OK
            zoo.addAnimal(penguin1);   // OK
            zoo.addAnimal(penguin2);   // Age négatif, lance InvalidAgeException
            zoo.addAnimal(penguin3);   // OK
        } catch (InvalidAgeException e) {
            System.out.println("Erreur d'âge : " + e.getMessage());
        } catch (ZooFullException e) {
            System.out.println("Zoo plein : " + e.getMessage());
        }

        System.out.println("\n--- Animaux présents dans le zoo ---");
        zoo.displayAnimals();

        System.out.println("\n--- Test des méthodes Carnivore et Omnivore ---");

        // Test pour le Dolphin (Carnivore)
        dolphin1.eatMeat(Food.MEAT);
        dolphin1.eatMeat(Food.PLANT);

        // Test pour le Terrestrial (Omnivore)
        lion.eatMeat(Food.MEAT);
        lion.eatPlant(Food.PLANT);
        lion.eatPlantAndMeet(Food.BOTH);
        lion.eatPlantAndMeet(Food.MEAT);
        lion.eatPlantAndMeet(Food.PLANT);

        System.out.println("\n--- Tous les animaux aquatiques nagent ---");
        zoo.swimAllAquatic();

        System.out.println("\n--- Nombre d'animaux aquatiques par type ---");
        zoo.displayNumberOfAquaticsByType();

        System.out.println("\n--- Profondeur maximale de nage des pingouins ---");
        System.out.println("Max depth: " + zoo.maxPenguinSwimmingDepth() + " meters");
    }
}



