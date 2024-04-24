// public class ExceptionExample {
//     public static void main(String[] args) {

//         try {
//             int c = 100 / 0;
//         } catch (ArithmeticException e) {
//             System.out.println(e);
//         }
//         System.out.println("Exception");

//     }

// }

public class ThrowsExce extends RuntimeException {
    ThrowsExce(String msg) {
        super(msg);
    }

}

class age {
    public static void main(String[] args) {
        int age = 23;
        if (age > 21) {
            System.out.println("You are eligible for marrige");
        } else {
            System.out.println("You are not eligible for marrige");
        }

    }
}