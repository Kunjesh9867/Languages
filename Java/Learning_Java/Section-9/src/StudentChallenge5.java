public class StudentChallenge5 {
    public static void main(String[] args) {
        // (1) Rotating an Array

        // Left Rotating
        int[] A = {1,2,3,4,5,6,7,8,9,10};

        int firstValue = A[0];
        //A[A.length-1] = A[0];
        for (int i = 0; i <A.length-1 ; i++) {
            A[i]=A[i+1];
        }
        A[A.length-1] = firstValue;

        for (int x :A) {
            System.out.print(x+" ");
        }


        System.out.println();
        System.out.println();


        // Right Rotation
        int[] B = {1,2,3,4,5,6,7,8,9,10};
        int lastValue = B[B.length-1];
        for (int i = A.length; i >=2 ; i--) {
            B[i-1]=B[i-2];
        }
        B[0] = lastValue;

        for (int y: B) {
            System.out.print(y+" ");
        }


        System.out.println();
        System.out.println();


        // Inserting an element at a particular place. Rest elements should be shifted
        int[] C = new int[10];
        C[0] = 5;
        C[1] = 9;
        C[2] = 6;
        C[3] = 10;
        C[4] = 12;
        C[5] = 7;

        // for display array elements in the terminal
        for (int i = 0; i <=5; i++) {
            System.out.print(C[i]+" ");
        }

        // Enter the index and value, where you have to insert it into.
        int index = 2;
        int value = 5;

        int n = 6; // the last index, where the for loop will be used

        for (int i = 6; i >=2; i--) {
            C[i]=C[i-1];
        }
        C[index]=value;


        System.out.println();
        for (int z:C) {
            System.out.print(z+" ");
        }
        //The above will result in 5 9 5 6 10 12 7 0 0 0

        System.out.println();
        System.out.println();

        // Deleting an element from an array
        // So, when you delete an element, the element is deleted but the place is not deleted
        // It is vacant, but not deleted.
        // SO, in this scenario, we can bring rest all element a one place forward

        int[] D = new int[10];
        D[0]=5;
        D[1]=9;
        D[2]=6;
        D[3]=10;
        D[4]=12;
        D[5]=7;


        int deleteElementIndex = 1;
        for (int i = 2; i < D.length; i++) {
            D[i-1] = D[i];
        }

        for (int xxx: D) {
            System.out.print(xxx+" ");
        }
        // From:  5 9 6 10 12 7 0 0 0 0
        // To:    5 6 10 12 7 0 0 0 0 0


    }
}
