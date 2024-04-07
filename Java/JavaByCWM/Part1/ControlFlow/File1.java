package ControlFlow;

import java.util.Scanner;

public class File1 {
    public static void main(String[] args) {
        /* COMPARISON OPERATORS */
        /*
        * We use comparison operator in Primitive values
        * Types:
        * ==, !=, <, <=, >, >=
        *
        * */
        System.out.println(1==1); // true
        System.out.println(1!=1); // false

        /* LOGICAL OPERATORS */
        /*
        * Types:
        * ||, &&, !
        * */
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature<30;
        System.out.println(isWarm); // true

        /* IF STATEMENTS */
        /*
        * MOSH TIP:
        * else-if start in the next line => to make it more readable
        * */
        int temp = 32;
        if(temp>30) {
            System.out.println("It's a hot day");
        }
        else if (temp > 20 && temp < 30 ) {
            System.out.println("Beautiful day");
        }
        else{
            System.out.println("Cold day");
        }

        /* SIMPLIFYING IF STATEMENTS */
        int income = 120_000;
        boolean hasHighIncome;

        // Amateur Code
        if(income>100_000){
            hasHighIncome = true;
        }
        else{
            hasHighIncome=false;
        }

        // Simplified
        boolean hasHighIncome2 = false;
        if(income>100_000){
            hasHighIncome = true;
        }

        // Most Simplified
        boolean hasHighIncome3 = (income>100_000);
        // MOSH TIP: Try to use ( ) around the expression

        /* TERNARY OPERATORS */
        int employeeIncome = 120_000;

        // Amateur Code
        String className;
        if(employeeIncome>100_000){
            className="First Class";
        }
        else{
            className ="Economy";
        }

        // Using Ternary Operator
        String className2 = (income>100_000) ? "First Class" : "Economy";
        //                      condition         value-1       value-2

        /* SWITCH STATEMENTS */
        String role = "admin";
        if(role=="admin")
            System.out.println("You're a admin");
        else if (role=="moderator")
            System.out.println("You're a moderator");
        else
            System.out.println("Guest");

        // Using switch
        switch (role){
            case "admin":
                System.out.println("You're a admin");
                break;
            case "moderator":
                System.out.println("you're a moderator");
                break;
            default:
                System.out.println("guest");
        }

        /* FOR LOOPS */
        for (int i = 5; i > 0; i--) {
            System.out.println(i+" Hello Kunjesh");
        }

        /* FOR-EACH LOOP */
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String x: fruits) {
            System.out.println(x);
        }


        /* WHILE LOOPS */
        Scanner sc = new Scanner(System.in);
        String userInput = " ";
        while (!userInput.equals("quit")){ // userInput!=quit will look for reference => Wrong approach
            System.out.print("Enter your choice: ");
            userInput = sc.next();
        }



        /* DO-WHILE LOOPS */
        /*
        * Executed at least  one time
        * Rarely used
        * */
        do{
            System.out.print("Enter your choice: ");
            userInput = sc.next();
        }while(!userInput.equals("quit"));

        /* BREAK AND CONTINUE STATEMENTS */
        while (true){ // userInput!=quit will look for reference => Wrong approach
            System.out.print("Enter your choice: ");
            userInput = sc.next();
            if(userInput.equals("pass"))
                continue;
            if(userInput.equals("quit"))
                break;
            System.out.println(userInput);
        }




    }
}
