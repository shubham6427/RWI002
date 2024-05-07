public class PriorityDemo extends Thread {
    public void run() {
        System.out.println("Child priority");
        System.out.println("Get priority on child " + Thread.currentThread().getPriority());
    }
}

class Main1 {
    public static void main(String[] args) {
        System.out.println("Main Priority");
        System.out.println("Get priority on Main : " + Thread.currentThread().getPriority());
        PriorityDemo p = new PriorityDemo();
        p.setPriority(7);
        p.start();
    }
}
