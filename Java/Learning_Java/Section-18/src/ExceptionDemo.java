import java.util.Scanner;

public class ExceptionDemo
{
    public static void main(String[] args)
    {
        int a=5,b=0;
        try {
            int c=a/b;
            System.out.println("Division is" +c);
        }catch (Exception e){
            System.out.println();
        }

    }
}