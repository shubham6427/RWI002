package maven.hiber.demo.MavenHiberDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println("Get method.....");
		Student student=(Student)session.get(Student.class,7 );
		System.out.println(student);
		
		Address address=(Address)session.get(Address.class, 7);
		System.out.println(address);
		
		System.out.println("Load method...");
		Student studentLoad=(Student)session.load(Student.class,7 );
		System.out.println(studentLoad);
		
		Address addressLoad=(Address)session.load(Address.class, 7);
		System.out.println(addressLoad);
		
		session.close();
		factory.close();

	}

}
