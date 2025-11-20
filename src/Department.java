import java.util.Objects;

public class Department implements Comparable<Department> {
    private int id, nbrEmploy;
    private String nomDepart;

    public Department(int id, int nbrEmploy, String nomDepart) {
        this.id = id;
        this.nbrEmploy = nbrEmploy;
        this.nomDepart = nomDepart;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrEmploy() {
        return nbrEmploy;
    }

    public void setNbrEmploy(int nbrEmploy) {
        this.nbrEmploy = nbrEmploy;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o) return false;
        if (o instanceof Department d) {
            return d.getId() == this.getId() && this.getNomDepart().equals(d.getNomDepart());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.nomDepart);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", nbrEmploy=" + nbrEmploy +
                ", nomDepart='" + nomDepart + '\'' +
                '}';
    }

    @Override
    public int compareTo(Department o) {
        return this.id - o.id;
    }
}
