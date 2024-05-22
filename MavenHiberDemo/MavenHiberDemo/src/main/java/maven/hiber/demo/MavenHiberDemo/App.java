package maven.hiber.demo.MavenHiberDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
     Configuration cfg=new Configuration();
     cfg.configure("hibernate.cfg.xml");
     SessionFactory factory=cfg.buildSessionFactory();
     
     Student st = new Student();
     //st.setId(101);
     st.setName("Shubham");
     st.setCity("Rewa");
     System.out.println("Student detail : "+st);
     
     
     
     Address ad= new Address();
//     /ad.setHouseNo(408);
     ad.setColony("Dhekha");
     ad.setWardNo("Ward No - 5");
     System.out.println("Address : "+ad);
     
     Session session=factory.openSession();
     Transaction tx =session.beginTransaction();
     
     session.save(st);
     session.save(ad);
     tx.commit();
          session.close();
          factory.close();
    }
}
