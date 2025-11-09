package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Création d'instances avec constructeurs par défaut ---");
        Animal aDefault = new Animal();
        Aquatic aqDefault = new Aquatic();
        Terrestrial tDefault = new Terrestrial();
        Dolphin dDefault = new Dolphin();
        Penguin pDefault = new Penguin();
        Zoo zDefault = new Zoo();

        System.out.println(aDefault);
        System.out.println(aqDefault);
        System.out.println(tDefault);
        System.out.println(dDefault);
        System.out.println(pDefault);
        System.out.println("Zoo par défaut : " + zDefault.getName() + ", " + zDefault.getCity());

        System.out.println("\n--- Création d'instances avec constructeurs paramétrés ---");
        Animal a1 = new Animal("Felidae", "Simba", 5, true);
        Terrestrial t1 = new Terrestrial("Felidae", "Shere Khan", 7, true, 4);
        Dolphin d1 = new Dolphin("Flipper", 6, 35.5f);
        Penguin p1 = new Penguin("Pingu", 3, 15f);
        Aquatic aq1 = new Aquatic("FishFamily", "Nemo", 1, false, "Ocean");
        Zoo z1 = new Zoo("Zoo de Lyon", "Lyon", 10);
        Zoo z2 = new Zoo("Zoo de Paris", "Paris", 15);

        System.out.println(a1);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);
        System.out.println(aq1);
        System.out.println("Zoo paramétré : " + z1.getName() + ", " + z1.getCity());

        System.out.println("\n--- Ajout d'animaux au zoo z1 ---");
        z1.addAnimal(a1);
        z1.addAnimal(t1);
        z1.addAnimal(d1);
        z1.addAnimal(p1);
        z1.addAnimal(aq1);

        System.out.println("\n--- Affichage des animaux du zoo z1 ---");
        z1.displayAnimals();

        System.out.println("\n--- Test de recherche et suppression ---");
        Animal recherche = new Animal("Felidae", "Simba", 5, true);
        int index = z1.searchAnimal(recherche);
        System.out.println("Index de 'Simba' : " + index);

        z1.removeAnimal(t1);
        System.out.println("Après suppression de Shere Khan :");
        z1.displayAnimals();

        System.out.println("\n--- Test de la méthode swim() ---");
        aq1.swim();    // This aquatic animal is swimming.
        d1.swim();     // This dolphin is swimming.
        p1.swim();     // This penguin is swimming.

        System.out.println("\n--- Test zoo plein ---");
        System.out.println("Zoo z1 plein ? " + z1.isZooFull());

        System.out.println("\n--- Comparaison de zoos ---");
        z2.addAnimal(new Penguin("Pengy", 2, 10f));
        z2.addAnimal(new Dolphin("Dolly", 4, 30f));
        Zoo zooPlusPeuple = Zoo.comparerZoo(z1, z2);
        System.out.println("Le zoo avec le plus d'animaux est : " + zooPlusPeuple.getName() +
                " avec " + zooPlusPeuple.getAnimalCount() + " animaux.");
    }
}


