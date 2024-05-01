// Inheritance (IS-A) practice with object initialize through method ..................

class inheritanseDemo {

    int serialNo;
    String name;
    static String School = "Miss Hill Public School";
    // System.out.println(School);
    static String company = "Railworld India PvtLtd";
    String place;
}

public class check extends inheritanseDemo {

    String nativePlace;
    int pinCode;

    void display(int s, String n, String na, int p) {
        serialNo = s;
        name = n;
        nativePlace = na;
        pinCode = p;

    }

    void display2(int s, String n, String pl, int p) {
        serialNo = s;
        name = n;
        place = pl;
        pinCode = p;
    }

    void Display() {
        System.out.println(
                serialNo + ". My Name is " + name + "      Native Place is " + nativePlace + "     School name is "
                        + School + "     Pincode-" + pinCode);
    }

    void Display2() {
        System.out.println(
                serialNo + ". My Name is " + name + "      Working at " + company + "     Now Live at "
                        + place + "     Pincode-" + pinCode);
    }
}

class test extends check {
    public static void main(String[] args) {

        check p1 = new check();
        check p2 = new check();
        p1.display(1, "Shubham Tiwari", "Rewa", 486001);
        p1.Display();
        p2.display2(2, "Shubham Tiwari", "Vijaynagar, Indore", 452010);
        p2.Display2();
        p1.display(3, "Siddhant", "Dhar", 232939);
        p1.Display();
        p1.display(4, "Satyam Tiwari", "Rewa", 486001);
        p1.Display();
        p2.display2(5, "Piyush", "Nandanagar, Indore", 452010);
        p2.Display2();

    }
}
