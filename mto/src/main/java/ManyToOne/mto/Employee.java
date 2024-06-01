package ManyToOne.mto;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {

    @Id
    @Column(name = "Emp_Id")
    private int empId;

    private String empName;
    
    @ManyToMany
    @JoinTable(
        name = "Employee_Project",
        joinColumns = @JoinColumn(name = "Emp_Id"),
        inverseJoinColumns = @JoinColumn(name = "Pro_Code")
    )
    private Set<Project> projects;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
