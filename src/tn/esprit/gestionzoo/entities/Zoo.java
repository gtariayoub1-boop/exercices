package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int MAX_ANIMALS = 25;
    private final int nbrCages;
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount = 0;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[MAX_ANIMALS];
    }

    // Getters et setters
    public String getName() { return name; }
    public String getCity() { return city; }
    public int getNbrCages() { return nbrCages; }
    public int getAnimalCount() { return animalCount; }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Erreur : le nom du zoo ne peut pas être vide !");
            this.name = "Zoo inconnu";
        } else {
            this.name = name;
        }
    }

    // Ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein ! Impossible d'ajouter " + animal.getName());
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println(animal.getName() + " est déjà présent dans le zoo !");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println(animal.getName() + " a été ajouté au zoo.");
        return true;
    }

    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println(animal.getName() + " n'a pas été trouvé dans le zoo.");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        System.out.println(animal.getName() + " a été supprimé du zoo.");
        return true;
    }

    // Recherche par nom
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    // Vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= Math.min(nbrCages, MAX_ANIMALS);
    }

    // Comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }

    // Affichage des animaux
    public void displayAnimals() {
        System.out.println("Animaux présents dans le zoo :");
        if (animalCount == 0) {
            System.out.println("Aucun animal pour le moment.");
            return;
        }
        for (int i = 0; i < animalCount; i++) {
            System.out.println("- " + animals[i].getName() + " (" + animals[i].getFamily() + ", âge: " + animals[i].getAge() + ")");
        }
    }

    // Affichage infos
    public void displayZooInfo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("Nombre d'animaux : " + animalCount);
        System.out.println("Capacité maximale : " + MAX_ANIMALS);
    }
}
