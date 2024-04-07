public class CreatingStringObjects {
    public static void main(String[] args) {
//        String str1 = "Java Program";
//
//        String str2 = new String("JAVA");
//
//        char[] c = {'H','e','l','l','o'};
//        String str3 = new String(c);
//        System.out.println(str3);  Hello
//
//        byte[] b = {65,66,67,68};
//        String str4 = new String(b,2,2); // Offset => Starting index
//        System.out.println("str4: "+str4);
//        System.out.println(str4);

        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1==str2); // true = if pointing to the same reference Else false

        // Interesting
        // If you create an object in POOl and another in HEAP
        // Are they same or different?
        String str3 = "Java";
        String str4 = new String("Java");
        System.out.println(str3==str4); // false
    }
}
