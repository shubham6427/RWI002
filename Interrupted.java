
// class Geeks extends Thread {
// public void run() {
// try {
// Thread.sleep(2000);
// System.out.println("Geeksforgeeks");
// } catch (Exception e) {
// System.out.println("Jai Shree Ram....");
// }
// }

// public static void main(String args[]) {
// Geeks t1 = new Geeks();
// t1.start();
// try {
// t1.interrupt();
// } catch (Exception e) {
// System.out.println("Exception handled");
// }
// }
// }

// Another Interrupted Thread........

// class InterruptedDemo extends Thread {
// public void run() {
// try {
// System.out.println("This is inside the try 1");
// // Thread.sleep(2000);
// System.out.println("This is inside the try ");
// } catch (Exception e) {
// System.out.println("This is inside catch ");
// }
// }

// public static void main(String[] args) {
// InterruptedDemo id = new InterruptedDemo();
// id.start();
// id.interrupt();
// }
// }

class Interrupted1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Is this is interrupted : " + Thread.interrupted());
                System.out.println("Is this is interrupted 2 : " + Thread.interrupted());

                System.out.println("Is this is isInterrupted : " + isInterrupted());
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println("This is in Interrupted");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class InTest {
    public static void main(String[] args) {
        Interrupted1 i = new Interrupted1();
        System.out.println("Is this is interrupted 3 : " + Thread.interrupted());
        i.start();
        i.interrupt();
    }
}