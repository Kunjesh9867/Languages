package Debugging;

public class Main {
    public static void primeNumbers(int limit){
        for (int i = 0; i <limit ; i+=2) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        /*
        * Types of Errors:
        * (1) Compile-time Error = Google, StackOverFlow = When the grammar of code is incorrect, syntax error
        * Code editor helps you
        * (2) Run-time Error = We use debugger to solve this
        * */

        System.out.println("Start");
        primeNumbers(4);
        System.out.println("Finish");

    }

}
