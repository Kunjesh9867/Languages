import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        // Converting Integer into String
        int n = sc.nextInt();

        String toString = n+"";
        String reverseString = "";
        for (int i = toString.length()-1; i >= 0 ; i--) {
            reverseString+=toString.charAt(i);
        }

        System.out.println(reverseString);
        if(toString.equals(reverseString))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        // By Integer only
        System.out.print("Enter a number n2: ");
        int n2 = sc.nextInt();
        int n3 = n2; // Cheking in "If" statement
        int reverse = 0;
        int remainder = 0;
        while (n2>0) {
            remainder = n2%10;
            reverse = reverse*10+remainder;
            n2=n2/10;
        }
        System.out.println(reverse);
        if(n3==reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
