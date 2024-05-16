import java.util.TreeMap;

class MapTreeDemo {
	public static void main(String[] args) {
		TreeMap tm= new TreeMap();
		tm.size();
		tm.put(1, "Apple");
		tm.put(2, "Orange");
		tm.put(3, "Mango");
		tm.put(4, "Grapes");
		tm.put(5, "PineApple");
		tm.put(6, "DragunFruit");
	    System.out.println(tm);	
	    tm.put(1, 1);
	    System.out.println(tm);
//	    tm.remove(1);
//	    System.out.println(tm);
//	    tm.higherEntry(tm);
//      System.out.println(tm);
	    System.out.println(tm.size());
	}
	

}
