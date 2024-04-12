import java.util.*;

public class $1_Date {
    public static void main(String[] args) {
        // Milliseconds to date
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

        System.out.println(Long.MAX_VALUE);



        //? DATE
        // This DATE class has been depricated
        // Java has provided TIME API => new
        {
            Date d = new Date(); // works based on milliseconds
            // Eg
            // Date d2 = new Date(System.currentTimeMillis());
            // System.out.println(d2);
            // Same Answer
            System.out.println(d);


            // DATE class has a constructor when we can write the date & it will give formatted date
            Date d2 = new Date("11/04/2024"); // Only "/"
            System.out.println(d2);


            Date dateOperations = new Date();
            System.out.println(dateOperations.getTime());
            System.out.println(dateOperations.getDate());
            System.out.println(dateOperations.getDay());
            System.out.println(dateOperations.getMonth()); // Java start counting with 0
            System.out.println(dateOperations.getYear()); // Java starts counting from 1900, so add +1900


        }






    }
}
