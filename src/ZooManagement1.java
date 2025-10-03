import java.util.Scanner;

public class ZooManagement1 {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {

        ZooManagement1 zoo = new ZooManagement1();

        System.out.print("Entrez le nom du zoo : ");
        Scanner s = new Scanner(System.in);
        zoo.zooName = s.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        zoo.nbrCages = s.nextInt();

        System.out.println("Le zoo " + zoo.zooName + " contient " + zoo.nbrCages + " cages.");

        s.close();
    }
}