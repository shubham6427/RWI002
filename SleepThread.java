class SleepThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Before Try and Catch ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

}

class Sleep {

    public static void main(String[] args) {
        System.out.println("In main before thread ");
        SleepThread s = new SleepThread();
        s.start();
        System.out.println("In main After thread ");
    }
}

// Another Sleep Thread Example ........

// class SleepDemo extends Thread {
// public void run() {
// for (int j = 1; j <= 5; j++) {
// try {
// Thread.sleep(1000);
// } catch (Exception e) {
// System.out.println(e);
// }
// System.out.println("This is in j " + j);

// }

// }

// }

// class MyTest extends Thread {
// public void run() {
// for (int i = 0; i <= 6; i++) {
// try {
// Thread.sleep(1500);
// } catch (Exception e) {
// System.out.println(e);
// }
// System.out.println(i);
// }
// }
// }

// class MainMethod {
// public static void main(String[] args) {
// System.out.println("Check and back");
// SleepDemo s = new SleepDemo();
// s.start();
// System.out.println("Check");
// MyTest t = new MyTest();
// t.start();
// }
// }