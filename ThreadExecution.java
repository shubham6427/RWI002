// // First  currentThread.............
// class ThreadExecution {

//     public static void main(String[] args) {
//         System.out.println("In main : " + Thread.currentThread().getName());
//         Thread.currentThread().setName("Shubham");
//         System.out.println("After setName : " + Thread.currentThread().getName());
//         Thread.currentThread().setName("Satyam");
//         System.out.println("After setName : " + Thread.currentThread().getName());
//     }

// }

// Second currentThread........
class ThreadExecution extends Thread {
    public void run() {
        float a = 2;
        float b = 3;
        float c = b / a;
        System.out.println(c);
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("In run method ");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().isDaemon());
    }
}

class InnerThreadExecution {
    public static void main(String[] args) {
        System.out.println("In main : " + Thread.currentThread().getName());
        Thread.currentThread().setName("Current Thread a  ");
        System.out.println("1 setName : " + Thread.currentThread().getName());
        Thread.currentThread().setName("Current Thread b ");
        System.out.println("2 setName : " + Thread.currentThread().getName());

        ThreadExecution t = new ThreadExecution();
        t.start();
        ThreadExecution t1 = new ThreadExecution();
        t1.start();
    }

}
