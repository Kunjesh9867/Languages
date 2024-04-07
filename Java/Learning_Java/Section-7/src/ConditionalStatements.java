public class ConditionalStatements {
    public static int f(){
        int i =5;
        int j =10;
        System.out.println(i);
        return i;
    }
    public static void main(String[] args){
        int i = -5;
        if(i>=0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
        int x = f();
        System.out.println(x);
    }
}