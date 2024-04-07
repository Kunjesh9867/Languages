public class StudentChallenge3 {
    // Maximum of numbers using varargs
    static int max(int ...numbers){
        if(numbers.length==0){
            return Integer.MAX_VALUE;
        }
        else{
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if(numbers[i]>max){
                    max=numbers[i];
                }
            }
            return max;
        }
    }

    // Sum of all elements using varargs
    static int sum(int ...numbers){
        int total = 0;
        for (int i = 0; i <numbers.length ; i++) {
            total+=numbers[i];
        }
        return total;
    }
    // Calculate Discount using varargs
    static void discount(int ...numbers){
        int total = 0;
        for (int i = 0; i <numbers.length ; i++) {
            total+=numbers[i];
        }
        if(total>1000){
            System.out.println("Discount is 10%");
        }
        else{
            System.out.println("Discount is 5%");
        }
    }

    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(10,2));
        System.out.println(max(1000,1));

        discount(12,32,2122);


    }
}
