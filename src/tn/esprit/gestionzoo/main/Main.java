package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;


    public class Main {
        public static void main(String[] args) {

            // Création d'un zoo avec capacité de 3 animaux
            Zoo zoo = new Zoo("Petit Zoo", "Lyon", 3);

            // Création d'animaux
            Terrestrial lion = new Terrestrial("Felidae", "Simba", 5, true, 4);
            Dolphin dolphin1 = new Dolphin("Flipper", 6, 35.5f);
            Penguin penguin1 = new Penguin("Pingu", 3, 15f);
            Penguin penguin2 = new Penguin("Pingu2", -2, 18f); // âge négatif pour tester InvalidAgeException
            Penguin penguin3 = new Penguin("Pingu3", 4, 12f);
            Penguin penguin4 = new Penguin("Pingu4", 5, 13f);
            // dépasse capacité pour tester ZooFullException

            System.out.println("\n--- Ajout des animaux ---");
            try {
                zoo.addAnimal(lion);       // OK
                zoo.addAnimal(dolphin1);   // OK
                zoo.addAnimal(penguin1);   // OK
                zoo.addAnimal(penguin2);   // Age négatif, lance InvalidAgeException
                zoo.addAnimal(penguin3);
            } catch (InvalidAgeException e) {
                System.out.println("Erreur d'âge : " + e.getMessage());
            } catch (ZooFullException e) {
                System.out.println("Zoo plein : " + e.getMessage());
            }

            System.out.println("\n--- Animaux présents dans le zoo ---");
            zoo.displayAnimals();
        }
    }



