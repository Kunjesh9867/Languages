public class StudentChallenge3 {
    public static void main(String[] args) {
        // Finding the maximum element in an array
        int[] A = {2,3,6,7,8,54,23,67,9,76,32,11};
        int max = A[0];
        for (int i = 0; i <A.length ; i++) {
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println("Maximum element is: "+max);

    }
}
