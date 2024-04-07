public class StudentChallenge {
    public static void main(String[] args) {
        // Display Multiplication Table

        int table = 5;
        for (int i=1;i<=10;i++){
            System.out.println(table+" * "+i+" = "+(table*i));
        }

        // Find sum of 'n' numbers
        int n = 10;
        int i = 1;
        int sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);

        // Factorial of a number
        int fact = 5;
        int integer=1;
        int summisan = 1;
        while (integer<=fact){
            summisan = summisan * integer;
            integer++;
        }
        System.out.println(summisan);

    }
}
