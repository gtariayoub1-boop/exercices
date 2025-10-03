public class ZooManagement
{

    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        System.out.println("Le zoo " + zoo.zooName + " contient " + zoo.nbrCages + " cages.");
    }
}
