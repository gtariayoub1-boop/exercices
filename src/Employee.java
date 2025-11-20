public class Employee implements Comparable<Employee> {
    private int id, grade;
    private String nom, prenom, nomDepart;

    public Employee(int id, int grade, String nom, String prenom, String nomDepart) {
        this.id = id;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepart = nomDepart;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepart='" + nomDepart + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId() - o.getId();
    }
}
