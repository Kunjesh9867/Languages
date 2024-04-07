public class StudentChallenge7 {
    public static void main(String[] args) {
        // Reverse Copying an array
        int[] A = {1,2,3,4,5};
        int[] B = new int[5];
        for (int i = 0; i < A.length ; i++) {
            B[i] = A[A.length-i-1];
        }

        // To display the output of B
        for (int x:B) {
            System.out.print(x+" ");
        }
    }
}
