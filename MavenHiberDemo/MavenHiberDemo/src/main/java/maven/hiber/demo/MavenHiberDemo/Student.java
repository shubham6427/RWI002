package maven.hiber.demo.MavenHiberDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shubham")
public class Student {

	public static final String session = null;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	
	private Certificate certi;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public static String getSession() {
		return session;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" : "+this.name+" : "+this.city+" ";
	}
	
	
}


