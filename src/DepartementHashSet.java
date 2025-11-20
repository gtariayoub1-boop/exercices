import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartment<Department> {
    Set<Department> departments;

    public DepartementHashSet() {
        this.departments = new HashSet();

    }


    @Override
    public void ajouterDepartement(Department department) {
        this.departments.add(department);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Department> it = this.departments.iterator();
        while (it.hasNext()) {
            if (it.next().getNomDepart().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Department department) {
        return this.departments.contains(department);
    }

    @Override
    public void supprimerDepartement(Department department) {
        this.departments.remove(department);
    }

    @Override
    public void displayDepartement() {
        System.out.println("Department : " + this.departments);
    }

    @Override
    public TreeSet<Department> trierDepartementById() {
        return new TreeSet<>(this.departments);
    }
}
