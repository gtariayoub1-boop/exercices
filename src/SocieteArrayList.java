import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employee> {
    List<Employee> employees;

    SocieteArrayList() {
        employees = new ArrayList<>();

    }


    @Override
    public void ajouterEmploye(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getNom().equals(nom)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        return this.employees.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employees);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(this.employees);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Comparator nameCreteria = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getNomDepart().compareTo(o2.getNomDepart());
            }

        };
        Comparator gradeCreteria = new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {

                return o1.getGrade() - o2.getGrade();
            }
        };
        Collections.sort(this.employees, nameCreteria.thenComparing(gradeCreteria));


    }
}
