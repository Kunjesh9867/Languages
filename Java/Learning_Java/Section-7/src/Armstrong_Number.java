import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        /*
        (1) Display Digits
        (2) Count Digits of a Number
        (3) Finding a number is Armstrong or not
        (4) Reverse a number
        (5) Check a number is palindrome
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        int m = number;   // For checking in "if" condition
        int r;
        int countNumberOfDigits=0;
        int total =0;
        while(number>0){
            r = number%10;
            total += (r*r*r);
            countNumberOfDigits++;
            number = number/10;
            System.out.println(r);
        }
//        System.out.println(countNumberOfDigits);
        if(total==m){
            System.out.println("Total is: "+total);
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Total is: "+total);
            System.out.println("Not an Armstrong Number");
        }

    }
}
