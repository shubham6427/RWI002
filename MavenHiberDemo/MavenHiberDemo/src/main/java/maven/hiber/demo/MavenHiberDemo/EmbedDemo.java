package maven.hiber.demo.MavenHiberDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     SessionFactory factory=cfg.buildSessionFactory();
	     
	     Student student1=new Student();
	     student1.setId(121);
	     student1.setCity("Rewa");
	     student1.setName("Shubham Tiwari");
	   
	     
	     Certificate certificate1= new Certificate();
	     certificate1.setCourse("HTML");
	     certificate1.setDuration("2 Month");
	     certificate1.setTeachBy("Deepak");
	 student1.setCerti(certificate1);
	    
	 
	 Student student2=new Student();
     student2.setId(463);
     student2.setCity("Dhar");
     student2.setName("Shiddhant Thakur");
   
     
     Certificate certificate2= new Certificate();
     certificate2.setCourse("Java");
     certificate2.setDuration("3 Month");
     certificate2.setTeachBy("Durgesh");
 student2.setCerti(certificate2);
     
 
	     Session s=factory.openSession();
	     Transaction tx= s.beginTransaction();
	     s.save(student1);
	     s.save(student2);
	     
	     tx.commit();
	     s.close();
	     factory.close();

	}

}
