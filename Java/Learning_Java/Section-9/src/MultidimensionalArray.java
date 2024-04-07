public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] A={{1,2,3,4},{2,4,6,8},{3,5,7,9}};

        // Accessing the elements of A using FOR loop
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        // Accessing the elements of A using FOR-EACH loop
        for (int x[]: A) {
            for (int y:x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }

    }
}
