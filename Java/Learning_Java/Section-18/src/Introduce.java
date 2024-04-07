public class Introduce {
    public static void main(String[] args) {
        try{
            int x = 5;
            int y = 0;
            System.out.println("End");
            System.out.println(x/y);
        }catch (ArithmeticException e){
            System.out.println("Division by zero: "+e);
        }
    }
}