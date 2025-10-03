public class main {

            public static void main(String[] args) {
                // Création de plusieurs animaux
                Animal lion = new Animal("Felidae", "Simba", 5, true);
                Animal tiger = new Animal("Felidae", "Shere Khan", 7, true);
                Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);

                // Création du zoo
                Zoo myZoo = new Zoo("Zoo de Lyon", "Lyon", 10);

                // Ajout des animaux au zoo
                myZoo.animals[0] = lion;
                myZoo.animals[1] = tiger;
                myZoo.animals[2] = elephant;

                // Affichage via displayZoo()
                myZoo.displayZoo();

                // Affichage direct via toString()
                System.out.println("\nAffichage direct du zoo :");
                System.out.println(myZoo);

                System.out.println("\nAffichage direct d'un animal :");
                System.out.println(lion);
            }
        }


