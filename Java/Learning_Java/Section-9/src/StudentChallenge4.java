public class StudentChallenge4 {
    public static void main(String[] args) {
        // Finding Second Largest Element
        /*
        int[] A = {12,2,3,4,11,6,7,8,9,10};
        int largest = A[0];
        int secondLargest = A[1];
        for (int i = 0; i <A.length ; i++) {
            if(A[i]>secondLargest){
                if (A[i]>=largest){
                    secondLargest = largest;
                    largest=A[i];
                }else{
                    secondLargest = A[i];
                }
            }
        }
        System.out.println("Largest element is: "+largest);
        System.out.println("Second Largest element is: "+secondLargest );
         */

        // This is a tough one.
        int[] A = {3,9,7,8,12,6,5};
        int max1,max2;
        max1=max2=A[0];
        for (int i = 0; i <A.length; i++) {
            if (A[i]>max1){
                max2=max1;
                max1=A[i];
            } else if (A[i]>max2) {
                max2=A[i];
            }
        }
        System.out.println("Largest Number is: "+max1);
        System.out.println("Second largest Number is: "+max2);
    }

    // More Effective
//    int[]  A = {3,9,7,8,12,6,150,5,4,151};
//
//
//    int largest = A[0];
//    int secondLargest = 0;
//
//
//        for (int i = 0; i < A.length ; i++) {
//        if(A[i] > largest){
//            secondLargest  = largest;
//            largest = A[i];
//
//        }
//
//    }
//        System.out.println(secondLargest);
}
