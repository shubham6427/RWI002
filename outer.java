// import java.util.Scanner;

public interface Inter {
    void school();

    void highSchool();

}

public interface outer {

    void higherSecondary();

}

class MHPS implements Inter, outer {
    public void school() {
        System.out.println("School name is Miss Hill Public School");

    }

    public void highSchool() {
        System.out.println("Number of Students in 10th is 123");
    }

    public void higherSecondary() {
        System.out.println("Number of Students in 12th is 186");
    }

    public static void main(String[] args) {
        MHPS mh = new MHPS();
        mh.school();
        mh.highSchool();
        mh.higherSecondary();
        // String mhp;
        // System.out.println("Enter the School Name: ");
        // Scanner sc = new Scanner(System.In);
        // mhp = sc.nextLineString(mh.school());
    }
}
