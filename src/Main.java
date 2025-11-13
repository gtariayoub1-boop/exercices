public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Création d'employés
        Employee emp1 = new Employee(1, "Ben Ali", "Mohamed", "Informatique", 3);
        Employee emp2 = new Employee(2, "Trabelsi", "Fatma", "RH", 2);
        Employee emp3 = new Employee(3, "Sassi", "Ahmed", "Informatique", 1);
        Employee emp4 = new Employee(4, "Masmoudi", "Leila", "Finance", 2);

        // Ajout des employés
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);
        societe.ajouterEmploye(emp4);

        System.out.println("=== Liste des employés ===");
        societe.displayEmploye();

        System.out.println("\n=== Recherche d'employé par nom ===");
        System.out.println("Recherche 'Sassi': " + societe.rechercherEmploye("Sassi"));
        System.out.println("Recherche 'Karray': " + societe.rechercherEmploye("Karray"));

        System.out.println("\n=== Tri par ID ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n=== Tri par département et grade ===");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n=== Suppression d'un employé ===");
        societe.supprimerEmploye(emp3);
        societe.displayEmploye();
    }
}