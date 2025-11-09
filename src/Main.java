public class Main {
    public static void main(String[] args) {
        // Création des zoos
        Zoo zoo1 = new Zoo("Zoo de Lyon", "Lyon", 10);
        Zoo zoo2 = new Zoo("Zoo de Paris", "Paris", 15);

        // Création des animaux
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal tiger = new Animal("Felidae", "Shere Khan", 7, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal giraffe = new Animal("Giraffidae", "Geoffrey", 4, true);

        // Ajouter des animaux aux zoos
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);

        zoo2.addAnimal(elephant);
        zoo2.addAnimal(giraffe);
        zoo2.addAnimal(lion); // test d'un animal déjà existant dans zoo1 (ok ici car chaque zoo est indépendant)

        // Affichage des infos
        System.out.println("\nInfos Zoo 1 :");
        zoo1.displayZooInfo();
        zoo1.displayAnimals();

        System.out.println("\nInfos Zoo 2 :");
        zoo2.displayZooInfo();
        zoo2.displayAnimals();

        // Test de isZooFull()
        System.out.println("\nZoo 1 plein ? " + zoo1.isZooFull());
        System.out.println("Zoo 2 plein ? " + zoo2.isZooFull());

        // Comparer les deux zoos
        Zoo zooPlusPeuple = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("\nLe zoo avec le plus d'animaux est : " + zooPlusPeuple.getName() +
                " avec " + zooPlusPeuple.getAnimalCount() + " animaux.");
    }
}
