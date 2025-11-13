import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SocieteArrayList implements IGestion<Employee> {
    private ArrayList<Employee> employees;

    public SocieteArrayList() {
        this.employees = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee emp : employees) {
            if (emp.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        return employees.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                int departementCompare = emp1.getNomDepartement().compareTo(emp2.getNomDepartement());
                if (departementCompare != 0) {
                    return departementCompare;
                }
                return Integer.compare(emp1.getGrade(), emp2.getGrade());
            }
        });
    }

    // Méthode supplémentaire pour obtenir la liste des employés
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}