public class StudentChallenge6 {
    public static void main(String[] args) {
        // Copying the array from A->B, same element
        int[] A = {1,2,3,4,5};
        int[] B = new int[5];

        for (int i = 0; i <A.length ; i++) {
            B[i] = A[i];
        }

        // To display the output of array A
        for (int i = 0; i <A.length ; i++) {
            System.out.print(A[i]+" ");
        }
        // To display the output of array B
        System.out.println();
        for (int i = 0; i <B.length ; i++) {
            System.out.print(B[i]+" ");
        }

    }
}
