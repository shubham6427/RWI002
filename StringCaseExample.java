public class StringCaseExample {
    public static void main(String[] args) {
        String name = "    Shubham Tiwari";
        String name2 = " Hello";
        String name3 = " hello";
        // CharAt Example
        char ch = name.charAt(8);
        System.out.println(ch);
        System.out.println(name);

        // Replace Example
        System.out.println(name.replace("Shubham Tiwari", "Shivam Mishra"));
        System.out.println(name.replace("a", "i"));
        System.out.println(name2.replace("H", "Kh"));

        // Trim Example
        System.out.println(name.trim());

        // length example
        System.out.println(name.length());

        // concate example
        System.out.println(name.concat(" is working at railworld India Pvt Ltd"));
        System.out.println(name.concat(name2));

        // Ignore Case Example.......
        System.out.println("Example of EqualIgnireCase : " + name.equalsIgnoreCase(name2));
        System.out.println("Example of EqualIgnireCase : " + name2.equalsIgnoreCase(name3));

        // byte Example.....
        byte[] bar2 = name2.getBytes();
        byte[] bar = name.getBytes();
        System.out.println("This byte code of Shubham Tiwari : " + bar);
        System.out.println("This byte code of Hello : " + bar2);

        // Lower and upper case Example...
        System.out.println("Example of Lower case : " + name.toLowerCase());
        System.out.println("Example of Lower case : " + name2.toLowerCase());
        System.out.println("Example of Upper case: " + name.toUpperCase());
        System.out.println("Example of Upper case: " + name2.toUpperCase());

        // Index of example....
        System.out.println("Example of IndexOf" + name.indexOf(10));

    }
}

// Replace String

// public class StringChange {
// public static void main(String[] args) {
// String name = "My name is Shubhm Tiwari";
// System.out.println(name);
// System.out.println(name.replace("Shubhm", "Shubham"));
// }
// }