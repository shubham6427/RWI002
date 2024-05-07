public class DemoensDemo extends Thread {
    public void run() {
        System.out.println("This is in demons");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isDaemon());
        Thread.currentThread().setName("In run");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }

}

class Test1 extends Thread {
    public static void main(String[] args) {
        DemoensDemo d = new DemoensDemo();
        d.start();
        d.setName("In main for run");
        // d.getName();
        // d.isAlive();
    }
}
