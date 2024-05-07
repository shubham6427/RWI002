class MultiThreading extends Thread {
    public void run() {
        System.out.println("Multithreading extends Thread....");
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MultiThreading m = new MultiThreading();
        // m.run();

        m.start();
    }
}
