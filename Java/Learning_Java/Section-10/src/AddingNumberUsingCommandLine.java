public class AddingNumberUsingCommandLine {

    static void sum(String ...numbers){
        int total=0;
        for (int i = 0; i < numbers.length; i++) {

            total+= Integer.parseInt(numbers[i]) ;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        sum(args);
    }
}
