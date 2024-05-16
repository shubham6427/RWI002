package collection2;

public class Demo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<String>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);

        ArrayList al2 = new ArrayList<String>();
        al2.add(1000);
        al2.add(2000);
        al2.add(3000);
        al2.add(4000);

        al.addAll(al2);
        System.out.println(al);
	}

}
