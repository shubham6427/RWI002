interface A{
	default void run(){
		System.out.println("A");
	}
}
interface B {
	default void run(){
			System.out.println("B");
		}
}

class Shubham implements A,B{
	public static void main(String[] args) {
		Shubham s=new Shubham();
		s.run();
	}

	@Override
	public void run() {
	
		A.super.run();
	}
}

