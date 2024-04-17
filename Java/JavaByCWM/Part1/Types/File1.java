package Types;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class File1 {
    public static void main(String[] args) {
        /* VARIABLES */
        /*
         * We use variables to temporary store data in computer memory's
         * You can declare multiple variables in the same line => not recommended by Mosh
        */

        int myAge = 30;
        int herAge = myAge; // Copying the value of one variable to another

        /*
         * In java, you can use _ to separate large number
         * use meaningful names
         * */
        byte age = 30;
        long viewsCount = 3_123_345_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        // Reference Type
        Date now = new Date();
        System.out.println(now); // Mon Jun 05 13:49:50 EDT 2023

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2); // java.awt.Point[x=2,y=1]
        /*
         * Reference types are copied by the reference
         * Primitive types are copied by the value
         * */



        /* STRINGS*/
        String message = "Hello World";
        String message1 = "Hello World";
        System.out.println(message1);

        String message3 = "Hello World" + '!';
        String message4 = "Hello World" + "!!";



        /* ESCAPE SEQUENCE*/
        /*
         * \n = newline
         * \t = Tab
         * \\ = \
         * \" = "
         *
         * 4 escape sequence used above are only used
         * Remember it, that's it
         * */
        String newMessage = "Hello \"Kunjesh\"";
        System.out.println(newMessage);
        String windowsFilePath = "c:\\Desktop\\FileName";
        System.out.println(windowsFilePath); // c:\Desktop\FileName



        /* ARRAYS */
        int[] number = new int[3];
        number[0] = 2;
        number[1] = 1;
        // number[10] = 3; // Exception = ArrayIndexOutOfBound
        System.out.println(number); // [I@7106e68e => This is the address

        System.out.println(Arrays.toString(number)); // [2, 1, 0]
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers2)); // [1, 2, 3, 4, 5]

        // To sort an array
        Arrays.sort(number);
        System.out.println(Arrays.toString(number)); // [0, 1, 2]



        /* MULTI - DIMENSIONAL ARRAYS */
        int[][] multiDArrays = new int[2][3];
        multiDArrays[0][0] = 5;

        System.out.println(Arrays.toString(multiDArrays)); // [[I@6576fe71, [I@76fb509a]
        System.out.println(Arrays.deepToString(multiDArrays)); // [[5, 0, 0], [0, 0, 0]]

        // Curly Braces Syntax
        int[][] multiDArrays2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(multiDArrays2)); // [[1, 2, 3], [4, 5, 6]]



        /* CONSTANTS */
        final float PI = 3.14F; // final means constant, value cannot be changed in the program
        // By convention, we use capital case for final


        /* ARITHMETIC OPERATORS */
        int result = 10 / 3; // 3
        System.out.println(result);

        float result2 = (float) 10 / (float) 3;
        System.out.println(result2);

        int x = 1;
        x++;

        x = x + 2;
        x += 2;

        /* ORDER OF OPERATOR */
        /*
         *   ()
         *   *,/
         *   +,-
         * */

        /* CASTING */

        // Implicit casting => No chance for data loss
        // byte > short > int > long > float > double
        short var1 = 1;
        int var2 = var1 + 2; //3

        double doubleVar = 1.1;
        int integerVar = (int) doubleVar + 2; // 3 => Explicit type conversion as we use (int)

        String userInput = "1.1";
        double y = Double.parseDouble(userInput) + 2;
        System.out.println(y); //3.1


        /* THE MATH CLASS*/
        System.out.println(Math.round(1.1F)); // 1
        System.out.println(Math.ceil(1.1F)); // 2.0
        System.out.println(Math.floor(1.1F)); // 1.0
        System.out.println(Math.max(1, 5)); // 5
        System.out.println(Math.min(1, 5)); // 1
        System.out.println(Math.random()); // 0.04768030943290158

        /* FORMATTING NUMBERS*/
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(1234567.891);
        System.out.println(currencyResult); // $1,234,567.89

        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        String currencyResult2 = percentInstance.format(0.1);
        System.out.println(currencyResult2); // 10%

        // ShortHand Way
        String currencyResult3 = NumberFormat.getPercentInstance().format(0.1); // Chaining Methods
        System.out.println(currencyResult3); // 10%


        /* READING INPUTS */
        Scanner sc = new Scanner(System.in); // Almost Every methods starts with 'next'
        int personAge = sc.nextInt();
        System.out.println("Your age is: " + personAge);


        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String personName = sc2.nextLine();
        System.out.println("Your name is:" + personName.trim());

        /*
         * IMPORTANT:
         * Why we have to use 2 scanner to get 2 outputs
         * if you use 1 scanner then the second time, you ask for input, it get automatically terminated
         * This is the case if you use two scanner after one another and in NEXLINE() only, others (next, nextInt etc). works fine.


         * System.out.println(k1.nextInt());
         * System.out.println(k1.nextLine());
         * THIS IS THE SCENARIO. nextLine in 2nd Line

         * * Let's say if you put A statement in between the 2 scanner => NO PROBLEM
         * See below
         * */

        /* PROJECT: MORTGAGE CALCULATOR */


        Scanner k1 = new Scanner(System.in);
        k1.nextInt();
        System.out.println("Hello");
        k1.nextByte();
    }
}
