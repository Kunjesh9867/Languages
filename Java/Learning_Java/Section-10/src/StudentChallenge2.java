import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentChallenge2 {
    // overloaded method to calculate areas
    static float area(float l, float b){
        return l*b;
    }
    static float area(float r){
        return (float)Math.PI*r*r;
    }

    // overloaded method to reverse an integer or array
    static int reverse(int num){
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev;
    }
    static int[] reverse(int[] arr){
        Arrays.sort(arr);
        int[] B = new int[arr.length];

        for (int i = arr.length-1,j=0; i >0  ; i--,j++) {
            B[j] = arr[i];
        }
        return B;
    }

    // overloaded method to validate name and age
    static boolean validate(String name){
        return name.matches("[A-Ba-b]+");
    }
    static boolean validate(int age){
        return age>=3 && age<=15;
    }



        public static void main(String[] args) {
        System.out.println(reverse(237));
        int[] reversedArray = reverse(new int[] {2,3,41,5});
        for (int i = 0; i <reversedArray.length ; i++) {
            System.out.print(reversedArray[i]+" ");
        }

        System.out.println(validate("kunjsdsds"));


    }
}
