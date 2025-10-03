import java.util.Scanner;

public class ZooManagement2 {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {

        ZooManagement2 zoo = new ZooManagement2();

        Scanner s = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = s.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        zoo.nbrCages = s.nextInt();

        // Premier affichage
        System.out.println("Le zoo " + zoo.zooName + " contient " + zoo.nbrCages + " cages.");

        // Deuxième affichage (message demandé)
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");

        s.close();
    }
}
