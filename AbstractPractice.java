abstract class AbstractPractice {
    abstract void calling();

    public void call() {
        System.out.println("Now i am trying to call");
    }
}

class Mobile extends AbstractPractice {
    void calling() {
        System.out.println("I am calling to you");
    }
}

class Main {
    public static void main(String[] args) {

        Mobile m = new Mobile();
        m.call();
        m.calling();
    }
}