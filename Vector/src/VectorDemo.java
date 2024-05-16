import java.util.Vector;
public class VectorDemo {

	public static void main(String... args) {
		Vector v=new Vector();
		v.addElement("Shubham");
		v.add("Second");
		v.addElement("Third");
		v.add(10);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.clone());
v.addFirst("First");
System.out.println(v);
v.addLast(v);
System.out.println(v);
v.addLast("Last");
System.out.println(v);
v.remove("Second");
System.out.println(v);
v.removeAllElements();
System.out.println(v);
v.add("Last");
System.out.println(v);

System.out.println(v.capacity());

	}

}
