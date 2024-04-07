import java.util.Scanner;

class DrinkingAgeLimitException extends Exception
{



    @Override
    public String toString(){
        return "sss";
    }
}

public class Codechef
{

    public static void checkingAge(int userAge) throws DrinkingAgeLimitException{
        if(userAge < 18){
            throw new DrinkingAgeLimitException();
        }
        System.out.println("Hurray");


    }


    public static void main(String[] args) throws DrinkingAgeLimitException
    {`
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age in integer: ");
        int age = sc.nextInt();

        checkingAge(age);



    }
}