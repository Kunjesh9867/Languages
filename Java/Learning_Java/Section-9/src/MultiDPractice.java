public class MultiDPractice {
    public static void main(String[] args) {
        // Different type of declaring an array
        int[][] A = new int[5][5];
        int[][] B = {{1, 2, 3}, {2, 4, 6}, {1, 3, 5}};
        int[][] C;
        C = new int[5][5];
        int D[][] = new int[5][5];
        int[] E[] = new int[5][5];

        int[] F, G[]; // F=1D || G=2D

        // 2D array
        int Z[][];
        Z = new int[3][];
        Z[0] = new int[5];
        Z[1] = new int[3];
        Z[2] = new int[8];
        for (int x[] : Z){
            for (int y : x){
                System.out.print(y + "");

            }
            System.out.println();
        }




    }
}
