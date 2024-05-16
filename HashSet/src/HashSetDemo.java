import java.util.HashSet;
public class HashSetDemo {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	
	hs.add("First hs");
	hs.add("Second hs");
	hs.add("Third hs");
	hs.add("Fourth hs");
	hs.add("Fivth hs");
	hs.add("Sixth hs");	
	hs.add(10);
	hs.add(20);
	hs.add(70);
	
	System.out.println(hs);
	
	hs.add(100);
	hs.add("First hs");
	System.out.println(hs);
	

	System.out.println(hs.remove("Second hs"));
	
	if(hs.contains("First hs")) {
		System.out.println("Yes HashSet contains this value");
	}else {System.out.println("No HashSet contains This value");
	}
	
System.out.println(hs.size());
if(hs.size()==5) {
	System.out.println("Size of this HashSet is right");
}else {
	System.out.println("Size of HashSet is more or less");
}


}
}
