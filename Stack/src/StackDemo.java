import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s=new Stack();
		s.push("First");
		s.push("Second");
		s.push("Third");
		s.push("Fourth");
		s.push("Fivth");
		System.out.println(s);
//		s.pop();
//		System.out.println(s);
//		s.pop();
//		System.out.println(s);
//		
//		System.out.println(s.peek());
		
//		System.out.println(s.empty());
//		System.out.println(s.elementAt(0));
//		System.out.println(s.elementAt(2));
	
		ListIterator<String> li=s.listIterator();
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

		Iterator<String> l=s.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
			
		}
//		l.remove();
		System.out.println(l.equals(s));
		System.out.println(l);
		System.out.println(l.getClass());



	}

}
