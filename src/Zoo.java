public class Zoo {
    private static final int MAX_ANIMALS = 25; // capacité maximale fixe
    private final int nbrCages; // constante par zoo
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[MAX_ANIMALS];
    }

    // Ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein ! Impossible d'ajouter " + animal.name);
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println(animal.name + " est déjà présent dans le zoo !");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println(animal.name + " a été ajouté au zoo.");
        return true;
    }

    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println(animal.name + " n'a pas été trouvé dans le zoo.");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        System.out.println(animal.name + " a été supprimé du zoo.");
        return true;
    }

    // Affichage des animaux
    public void displayAnimals() {
        System.out.println("Animaux présents dans le zoo :");
        if (animalCount == 0) {
            System.out.println("Aucun animal pour le moment.");
            return;
        }
        for (int i = 0; i < animalCount; i++) {
            System.out.println("- " + animals[i].name + " (" + animals[i].family + ", âge: " + animals[i].age + ")");
        }
    }

    // Recherche d'un animal par nom
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    // Affichage des infos du zoo
    public void displayZooInfo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("Nombre d'animaux présents : " + animalCount);
        System.out.println("Capacité maximale d'animaux : " + MAX_ANIMALS);
    }

    // 1. Vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= Math.min(nbrCages, MAX_ANIMALS);
    }

    // 2. Comparer deux zoos et retourner celui avec le plus d'animaux
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }

    // Getter du nombre d'animaux
    public int getAnimalCount() {
        return animalCount;
    }

    // Getter du nom du zoo
    public String getName() {
        return name;
    }
}
