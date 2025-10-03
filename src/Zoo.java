
    import java.util.Arrays;

    public class Zoo {
        Animal[] animals = new Animal[25]; // maximum 25 animaux
        String name;
        String city;
        int nbrCages;

        // Constructeur paramétré
        public Zoo(String name, String city, int nbrCages) {
            this.name = name;
            this.city = city;
            this.nbrCages = nbrCages;
        }

        // Méthode pour afficher les infos du zoo
        public void displayZoo() {
            System.out.println("Nom du zoo : " + name);
            System.out.println("Ville : " + city);
            System.out.println("Nombre de cages : " + nbrCages);
            System.out.println("Animaux : " + Arrays.toString(animals));
        }

        @Override
        public String toString() {
            return "Zoo{" +
                    "name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    ", nbrCages=" + nbrCages +
                    ", animals=" + Arrays.toString(animals) +
                    '}';
        }
    }


