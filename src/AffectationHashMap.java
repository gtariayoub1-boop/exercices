import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employee, Department> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap();
    }


    public void ajouterEmployeDepartement(Employee e, Department d) {
        if (affectations.containsKey(e)) {
            System.out.println("L'employé " + e.getNom() + " est déjà affecté à un département");
        } else {
            this.affectations.put(e, d);
            System.out.println("Employé " + e.getNom() + " affecté au département " + d.getNomDepart());
        }
    }


    public void afficherEmployesEtDepartements() {
        System.out.println("Liste des affectations Employé → Département : " );
        Set<Map.Entry<Employee, Department>> a = affectations.entrySet();
        for (Map.Entry<Employee, Department> e : a) {
            Employee emp = e.getKey();
            Department dep = e.getValue();
        }
    }


    public void supprimerEmploye(Employee e) {
        if (affectations.containsKey(e)) {
            affectations.remove(e);
            System.out.println("Employé " + e.getNom() + " supprimé des affectations");
        } else {
            System.out.println("Employé " + e.getNom() + " non trouvé dans les affectations");
        }
    }


    public void supprimerEmployeEtDepartement(Employee e, Department d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("Employé " + e.getNom() + " supprimé du département " + d.getNomDepart());
        } else {
            System.out.println("Aucune affectation trouvée pour cet employé dans ce département");
        }
    }


    public void afficherEmployes() {
        System.out.println("Liste des employés: ");
        for (Employee emp : affectations.keySet()) {
            System.out.println("Employé: " + emp.getNom() + " " + emp.getPrenom() +
                    " (ID: " + emp.getId() + ")");
        }
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements: ");
        for (Department dep : affectations.values()) {
            System.out.println("Département: " + dep.getNomDepart() +
                    " (ID: " + dep.getId() + ", Employés: " + dep.getNbrEmploy() + ")");
        }
    }


    public boolean rechercherEmploye(Employee e) {
        boolean exists = affectations.containsKey(e);
        System.out.println("Employé " + e.getNom() + " existe dans les affectations: " + exists);
        return exists;
    }

    public boolean rechercherDepartement(Department d) {
        boolean exists = affectations.containsValue(d);
        System.out.println("Département " + d.getNomDepart() + " existe dans les affectations: " + exists);
        return exists;
    }




    public TreeMap<Employee, Department> trierMap() {
        TreeMap<Employee, Department> sortedMap = new TreeMap<>(affectations);
        return sortedMap;
    }

}