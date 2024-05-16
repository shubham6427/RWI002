import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("First ts");
		ts.add("Second ts");
//		ts.add(300);
		ts.add("Third ts");
		ts.add("Fourth ts");
		ts.add("Fivth ts");
		
		System.out.println(ts);
		System.out.println(ts.remove("Fourth ts"));
		System.out.println(ts);

	}

}
