import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectation = new AffectationHashMap();

        // Création des employés
        Employee emp1 = new Employee(3, 2, "Dupont", "Jean", "IT");
        Employee emp2 = new Employee(1, 3, "Martin", "Marie", "RH");
        Employee emp3 = new Employee(2, 1, "Bernard", "Pierre", "Finance");
        Employee emp4 = new Employee(4, 2, "Dubois", "Sophie", "IT");

        // Création des départements
        Department dep1 = new Department(101, 10, "IT");
        Department dep2 = new Department(102, 5, "RH");
        Department dep3 = new Department(103, 8, "Finance");

        System.out.println("=== TEST AJOUT AFFECTATIONS ===");
        affectation.ajouterEmployeDepartement(emp1, dep1);
        affectation.ajouterEmployeDepartement(emp2, dep2);
        affectation.ajouterEmployeDepartement(emp3, dep3);
        affectation.ajouterEmployeDepartement(emp4, dep1);

        System.out.println("\nEST DUPLICATION EMPLOYÉ");
        affectation.ajouterEmployeDepartement(emp1, dep2); // Doit échouer

        System.out.println("\nFFICHAGE COMPLET");
        affectation.afficherEmployesEtDepartements();

        System.out.println("\nLISTE EMPLOYÉS");
        affectation.afficherEmployes();

        System.out.println("\nLISTE DÉPARTEMENTS");
        affectation.afficherDepartements();

        System.out.println("\nTEST RECHERCHE");
        affectation.rechercherEmploye(emp1);
        affectation.rechercherEmploye(new Employee(99, 1, "Inconnu", "Test", "Test"));
        affectation.rechercherDepartement(dep1);
        affectation.rechercherDepartement(new Department(999, 0, "Inexistant"));

        System.out.println("\nTEST SUPPRESSION");
        affectation.supprimerEmployeEtDepartement(emp2, dep2);
        affectation.supprimerEmploye(emp3);

        System.out.println("\n=== APRÈS SUPPRESSION ===");
        affectation.afficherEmployesEtDepartements();

        System.out.println("\n=== TEST TRI PAR ID ===");
        TreeMap<Employee, Department> mapTriee = affectation.trierMap();
        System.out.println("Map triée retournée : " + mapTriee);
    }
}