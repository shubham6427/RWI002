// // If Statement..................

// public class IfExample {
//     public static void main(String args[]) {
//         int a = 30;
//         if (a >= 32) {
//             System.out.println("a is greater than 32");
//         } else {
//             System.out.println(" a is equal to 30");
//         }
//     }
// }

// public class InnerIfExample {

//     public static void main(String[] args) {
//         int a = 24;
//         if (a <= 15) {
//             System.out.println("First condition is correct");
//         } else if (a >= 23) {
//             System.out.println("Second condition is correct");
//         } else if (a >= 24) {
//             System.out.println("Third condition is correct");
//         } else {
//             System.out.println("Fourth condition is correct");
//         }
//     }

// }

// public class IfNestedExample {
//     public static void main(String[] args) {
//         int age = 5;
//         int wieght = 24;
//         if (age <= 5) {
//             if (wieght >= 20) {
//                 System.out.println("Not eligible");
//             } else {
//                 System.out.println("eligible");
//             }
//         }

//     }

// }

// Switch statement................

// public class SwitchStatement {
// public static void main(String[] args) {
// String name = "Shubham";
// String Native = "Rewa";

// switch (name) {
// case "Satyam":
// Native = "Rewa";

// break;
// case "Shubha":
// Native = "Rewa";

// break;
// case "Rohit":
// Native = "Satna";

// break;
// case "Shubham":
// Native = "Rewa 1";

// break;
// default:
// Native = "Jabalpur";

// break;
// }
// System.out.println("My Native is: " + Native);
// }

// }

// This is only for testing.........

public class SwitchStringExample {
    public static void main(String[] args) {
        // Declaring String variable
        String levelString = "Expert";
        int level = 0;
        // Using String in Switch expression
        switch (levelString) {
            // Using String Literal in Switch case
            case "Beginner":
                level = 1;
                break;
            case "Intermediate":
                level = 2;
                break;
            case "Expert":
                level = 3;
                break;
            default:
                level = 0;
                break;
        }
        System.out.println("Your Level is: " + level);
    }
}

// For Loop Statement...............

// class ForExample {
// public static void main(String[] args) {
// int s = 22;
// for (int i = 0; i <= s; i++) {
// System.out.println("increment of i : " + i);
// }
// }
// }

public class ForExampleStar {
    public static void main(String[] args) {
        int s = 22;
        for (int i = 0; i <= s; i++) {
            for (int k = s; k >= i; k--) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}