public class Main {
    public static void main(String[] args) {

        /* ============================
               TEST DEPARTEMENT
           ============================ */

        DepartementHashSet depSet = new DepartementHashSet();

        Department d1 = new Department(1, 30, "Informatique");
        Department d2 = new Department(2, 15, "Finance");
        Department d3 = new Department(3, 20, "RH");

        // Ajouter
        depSet.ajouterDepartement(d1);
        depSet.ajouterDepartement(d2);
        depSet.ajouterDepartement(d3);

        // Afficher
        System.out.println("Liste des departements : ");
        depSet.displayDepartement();

        // Recherche par nom
        System.out.println("Recherche departement 'Finance' : " + depSet.rechercherDepartement("Finance"));
        System.out.println("Recherche departement 'Marketing' : " + depSet.rechercherDepartement("Marketing"));

        // Recherche par objet
        System.out.println("Recherche departement d2 : " + depSet.rechercherDepartement(d2));

        // Suppression
        depSet.supprimerDepartement(d2);
        System.out.println("Après suppression de Finance : ");
        depSet.displayDepartement();

        // Tri avec TreeSet
        System.out.println("Tri des departements par ID : ");
        System.out.println(depSet.trierDepartementById());


        /* ============================
                TEST EMPLOYES
           ============================ */

        System.out.println("\n============================");
        System.out.println("     TEST EMPLOYES");
        System.out.println("============================");

        SocieteArrayList societe = new SocieteArrayList();

        Employee e1 = new Employee(10, 3, "Ali", "Karoui", "Informatique");
        Employee e2 = new Employee(5, 1, "Sarra", "Mansour", "Finance");
        Employee e3 = new Employee(8, 2, "Houssem", "Trabelsi", "Informatique");
        Employee e4 = new Employee(7, 3, "Meriem", "Ben Ali", "RH");

        // Ajouter employés
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        // Affichage
        System.out.println("\nListe employés : ");
        societe.displayEmploye();

        // Recherche
        System.out.println("Recherche employé 'Ali' : " + societe.rechercherEmploye("Ali"));
        System.out.println("Recherche employé 'Ahmed' : " + societe.rechercherEmploye("Ahmed"));

        // Suppression
        societe.supprimerEmploye(e2);
        System.out.println("Après suppression de Sarra : ");
        societe.displayEmploye();

        // Tri par ID
        societe.trierEmployeParId();
        System.out.println("Tri employés par ID : ");
        societe.displayEmploye();

        // Tri par département puis grade
        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("Tri employés par NomDepartement + Grade : ");
        societe.displayEmploye();
    }
}
