import java.util.Arrays;

// Student Challenge = Find Prime Number
public class StudentChallenge1 {

    // Find a number is Prime
    static boolean primeNumber(int x){
        for (int i = 2; i <= (x/2) ; i++) {
            if(x%i==0){
                System.out.println(i);
                return false;
            }
        }
        return true;
    }

    // Find GCD/HCF of 2 numbers
    static int GCD(int num1, int num2){
        while(num1!=num2){
            if(num1>num2){
                num1 = num1-num2;
            }else{
                num2 = num2-num1;
            }
        }
        return num1;
    }

    // Find MAX element in an Array
    static int arrayMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }



    public static void main(String[] args) {

        // Prime
        boolean output = primeNumber(11);
        if(output)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

        // GCD
        System.out.println(GCD(5,3));

        // Max in array
        int[] array = {3,2,1,5,10,111,1212,4};
        System.out.println(arrayMax(array));
        System.out.println(arrayMax(new int[] {3, 2,1221,2121}));




    }
}
