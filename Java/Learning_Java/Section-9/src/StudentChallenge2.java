public class StudentChallenge2 {
    public static void main(String[] args) {
        // Searching for an element

        int[] C = {2,3,4,5,6,7,8,9,0};
        int element = 8;
        for (int i = 0; i < C.length; i++) {
            if(element==C[i]){
                System.out.println("Element is found at index: "+i);
                System.exit(0);  // To Terminate the code
            }
        }
        System.out.println("Not Found");
    }
}
