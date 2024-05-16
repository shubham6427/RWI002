import java.util.HashMap;
import java.util.Iterator;
//import java.util.Map;

public class MapName {

	public static void main(String[] args) {
	HashMap hm = new HashMap();
hm.put(1001,"Shubham");
hm.put(1002,"Mayank");
hm.put(1003,"Shiddhant");
System.out.println(hm);
	
if(hm.containsKey(1004)) {
	System.out.println("This key is available....");
}else {
	System.out.println("Not available......");
}

if(hm.containsValue("Shubham Tiwari")) {
	System.out.println("This name is valid...");
}else {
	System.out.println("Not valid name.....");
}

//System.out.println(hm.isEmpty());
//
//System.out.println(hm.clone());

//System.out.println(hm.remove(1001));
hm.replace(1001, "Shubham", "Shubham Tiwari");
System.out.println(hm);

//hm.clear();
//System.out.println(hm);

//System.out.println(hm.getClass());


//Iterator it = hm.iterator();
//while(it.hasNext()) {
//	System.out.println(it.next());
//}




	}

}
