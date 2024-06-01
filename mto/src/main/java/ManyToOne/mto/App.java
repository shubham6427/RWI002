package ManyToOne.mto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Configuration cfg = new Configuration();
        cfg.configure("manytoone.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Project pr1 = new Project();
        pr1.setProCode(1226);
        pr1.setProName("Khata");
        
        Project pr2 = new Project();
        pr2.setProCode(1227);
        pr2.setProName("Finance");
        
        Project pr3 = new Project();
        pr3.setProCode(1228);
        pr3.setProName("Operations");
        
        Employee emp1 = new Employee();
        emp1.setEmpId(1);
        emp1.setEmpName("Mayank");
        
        
        Employee emp2 = new Employee();
        emp2.setEmpId(3);
        emp2.setEmpName("Ram");
        
        Set<Project> projectsForEmp1 = new HashSet<>();
        projectsForEmp1.add(pr1);
        projectsForEmp1.add(pr2);
        
        Set<Project> projectsForEmp2 = new HashSet<>();
        projectsForEmp2.add(pr1);
        projectsForEmp2.add(pr3);
        
        emp1.setProjects(projectsForEmp1);
     emp2.setProjects(projectsForEmp2);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(pr1);
        session.save(pr2);
        session.save(pr3);
        session.save(emp1);
        session.save(emp2);
      
        
        tx.commit();
        session.close();
        factory.close();
    }
}
