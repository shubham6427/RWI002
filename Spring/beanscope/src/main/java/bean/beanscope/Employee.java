package bean.beanscope;

public class Employee {

	private int eId;
	private String eName;
	private Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee(int eId, String eName, Address address) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", address=" + address + "]";
	}
	
	
}
