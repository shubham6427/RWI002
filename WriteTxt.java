// 1st file handling example for create new file.....

// import java.io.*;

// class Kiles {

// public static void main(String[] args) {
// File f = new File("C:\\Users\\Shubham Tiwari\\Desktop\\newcase.txt");
// try {
// if (f.createNewFile()) {
// System.out.println("File Sucessfully Create");
// } else {
// System.out.println("File Already exist..");
// }

// } catch (IOException i) {
// System.out.println("Exception Handled..!");
// }

// }

// }

// 2nd file handling example.....

// import java.io.*;

// class Ram {
// public static void main(String[] args) {
// File f = new File("C:\\Users\\Shubham Tiwari\\Desktop\\File.txt");
// try {
// if (f.createNewFile()) {
// System.out.println("Now file is saved in documents folder. ");
// } else {
// System.out.println("You can't save this file because this file is already
// exist. ");
// }
// if (f.exists()) {
// System.out.println("File Name =" + f.getName());
// System.out.println("File Path=" + f.getAbsolutePath());
// System.out.println("File write =" + f.canWrite());
// System.out.println("File length =" + f.length());
// System.out.println("File Read =" + f.canRead());

// // System.out.println("File Remove =" + f.delete());

// } else {
// System.out.println("File does not exist");
// }

// } catch (IOException i) {
// System.out.println("Exception is handled in catch block. ");
// }
// }
// }

// 3rd file handling example.....Another try for rename and reader......

// import java.io.*;
// import java.io.FileReader;

// class RenameFile {
// public static void main(String[] args) {

// File Shubham = new File("C:\\Users\\Shubham Tiwari\\Desktop\\Shubham.txt");
// File ShubhamRename = new File("C:\\Users\\Shubham
// Tiwari\\Desktop\\Shubham_Rename.txt");

// try {
// if (Shubham.createNewFile()) {
// System.out.println(" File is saved");
// } else {
// System.out.println(" File is already saved");
// }
// if (Shubham.exists()) {
// // System.out.println("File Name =" + Shubham.getName());
// // System.out.println("File Name =" + Shubham.length());
// System.out.println(Shubham.renameTo(ShubhamRename) + " File is now renamed");
// } else {
// System.out.println("File does not exist");
// }
// } catch (IOException e) {
// System.out.println("Exception is handaled.");
// }
// }
// }

// 4th file handling example for File Reader.....

// import java.io.*;
// // import java.io.FileReader;

// class Reader {

//     public static void main(String[] args) {
//         File shubh = new File("C:\\Users\\Shubham Tiwari\\Desktop\\Shubham1.txt");
//         try {
//             if (shubh.createNewFile()) {
//                 System.out.println("File is now saved....");
//             } else {
//                 System.out.println("File is already exist.....");
//             }
//         } catch (IOException e) {
//             System.out.println("Exception is handled....");
//         }

//         try {
//             FileReader fr = new FileReader("C:\\Users\\Shubham Tiwari\\Desktop\\Shubham1.txt");
//             // try {
//             int i;
//             while ((i = fr.read()) != -1) {
//                 System.out.print((char) i);
//             }
//             // } finally {
//             // s.close();
//             // }
//         } catch (IOException e) {
//             System.out.println("Exception handled...");
//         }

//     }
// }

// 5th file handling example for File copy.....

import java.io.*;

class copyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream read = new FileInputStream("C:\\Users\\Shubham Tiwari\\Desktop\\Shubham1.txt");
        FileOutputStream write = new FileOutputStream("C:\\Users\\Shubham Tiwari\\Desktop\\ShubhamCopy.txt");
        int i;
        while ((i = read.read()) != -1) {
            write.write((char) i);
        }
        System.out.println("File is copyied to another file..");
    }

}