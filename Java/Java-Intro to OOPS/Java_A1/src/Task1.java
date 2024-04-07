import java.util.Scanner; // To get input from the user

 // I have intialize a class Task1
public class Task1 {


    public static void main(String[] args) {  //main method 

        Scanner sc = new Scanner(System.in);  // Scanner Object

        //To get first integer
        System.out.print("Enter first integer number: ");
        int a = sc.nextInt(); // Storing an integer value

        //To get second integer
        System.out.print("Enter second integer number: ");
        int b = sc.nextInt(); // Storing an integer value

        //To get Arithmetic Operator
        System.out.print("Enter an arithmetic operator ( +, -, *, /) : ");
        String operation = sc.next(); // Storing next value

        // Performing operation usinf if/else if ladder
        if (operation.equals("+")) {
            System.out.print("Answer is: " + (a + b));
        } else if (operation.equals("-")) {
            System.out.print("Answer is: " + (a - b));
        } else if (operation.equals("*")) {
            System.out.print("Answer is: " + (a * b));
        } else if (operation.equals("/")) {
            System.out.print("Answer is: " + (double) a / b);  // I have converted into double to get correct answer in decimal value
        } else {
            System.out.println("Please enter valid operator");
        }

    }

}
