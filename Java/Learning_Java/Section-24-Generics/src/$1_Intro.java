public class $1_Intro {
    public static void main(String[] args) {
        Object obj = new String("Kunjesh");

        String str = (String) obj;


        Object obj2 = 12;
        Integer x = (Integer) obj2;
        // String num = (String) obj2; // No error in editor
        // It will throw error when you run the program: ClassCastException
        // Runtime error
        // This is the drawback of Object class: Type Safety
        // There are many advantages but there is few drawbacks as well.



        //? Another Example
        // Using array of Object

        Object[] objArr = {"String", "String", 1};
        // This is allowed in object
        // NO TYPE SAFETY
        String i;
        for (int j = 0; j < 3; j++) {
            i = (String)objArr[j];
            System.out.println(i);
        }
        // Will the above code works. First 2 it will, then error





    }
}
