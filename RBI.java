abstract class RBI {
    abstract void homeLoan();

    abstract void intrestPercentage();

    abstract void savingPercentage();
}

class Axis extends RBI {

    void homeLoan() {
        System.out.println("Axis");
    }

    void intrestPercentage() {
        System.out.println("Intrest percentage in Axis bank is 9%");
    }

    public static void main(String[] args) {
        Axis ax = new Axis();
        ax.homeLoan();
        ax.intrestPercentage();
        Hdfc hd = new Hdfc();
        hd.homeLoan();
        hd.intrestPercentage();
        ICICI ic = new ICICI();
        ic.homeLoan();
        ic.intrestPercentage();
        ic.savingPercentage();
    }
}

class Hdfc extends RBI {

    void homeLoan() {
        System.out.println("HDFC");
    }

    void intrestPercentage() {
        System.out.println("Intrest percentage in HDFC bank is 11%");
    }
}

class ICICI extends RBI {
    void homeLoan() {
        System.out.println("ICICI");
    }

    void intrestPercentage() {
        System.out.println("Intrest percentage in ICICI bank is 11%");
    }

    void savingPercentage() {
        System.out.println("This bank provide more saving percentage as comparision to other bank");
    }
}