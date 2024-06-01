package ManyToOne.mto;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Project {

    @Id
    @Column(name = "Pro_Code")
    private int proCode;

    private String proName;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees;

    public int getProCode() {
        return proCode;
    }

    public void setProCode(int proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
