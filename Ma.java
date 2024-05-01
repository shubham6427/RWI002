// class College{
//     public void CollegeC(){System.out.println("This is College");}

// }
// class Mechanical extends College{
//     public void MechanicalC(){ System.out.println("This Mechanical branch which extends the College class");}
// }
// class Computer extends College{
//     public void ComputerC()  {System.out.println("This Computer branch which extends the College class");}
// }
// class Electrical extends College{
//    public void ElectricalC(){System.out.println("This Electrical branch which extends the College class");}
// }
// class test{
//     public static void main(String[] args) {
// College c=new College();
// Mechanical m=new Mechanical();
// Computer C=new Computer();
// Electrical e=new Electrical();

// c.CollegeC();
// m.MechanicalC();
// C.ComputerC();
// e.ElectricalC();

//     }
// }

// Method overloading  .................

// class test {
//     void show(int i) {
//         System.out.println("1");
//     }

//     void show(String s) {
//         System.out.println("2");
//     }

//     void show() {
//         System.out.println("3");
//     }

//     public static void main(String[] args) {
//         test t = new test();
//         t.show(10);
//     }
// }

// Method overriding...................

class college {
    void branch() {
        System.out.println("College");
    }
}

class Mechanical extends college {
    void show() {
        System.out.println("Mechanical");
    }
}

class CS extends college {
    void branch() {
        System.out.println("CS");
    }
}

class Electrical extends college {
    void branch() {
        System.out.println("Electrical");
    }
}

class Civil extends college {
    void branch() {
        System.out.println("Civil");
    }
}

public class Ma {
    public static void main(String[] args) {

        Mechanical m = new Mechanical();
        CS c = new CS();
        Electrical e = new Electrical();
        Civil ci = new Civil();
        m.show();
        c.branch();
        e.branch();
        ci.branch();
    }
}
