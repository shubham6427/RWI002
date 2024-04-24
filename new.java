abstract class Inter {
    abstract void countory();

    abstract void state();

}

class Outer {
    public void countory() {
        System.out.println("India");
    }

    public void state() {
        System.out.println("Madhya Pradesh");
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.countory();
        o.state();
    }
}
