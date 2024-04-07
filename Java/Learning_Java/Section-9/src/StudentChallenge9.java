public class StudentChallenge9 {
    public static void main(String[] args) {
        // TODO: 2023-03-28
        int[][] A = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] B = {{1,5,2},{6,8,4},{3,9,7}};

        int[][] X = new int[3][3];


        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                X[i][j]=A[i][j]+B[i][j];
                System.out.print(A[i][j]+B[i][j]+" ");
            }
            System.out.println();
        }
    }
}
