// I haven't created package as it is not required

public class Computer extends Keyboard implements Button {
    //       [class]          [abstract]          [interface]

    // Base Keyboard class here:
    public Computer(int digit, char letter) {
        super(digit, letter);
        getDigit();
        getLetter();
    }

    // Created an extra method to display value of 2 varible created in Button(interface)
    public static void Compute() {

        System.out.println("Initial value when First Button is pressed is: "+FIRST_VALUE);
        System.out.println("Initial value when Second Button is pressed is: "+SECOND_VALUE);
    }


    // Overriding methods of Button(interface) below:
    @Override
    public void leftButton(String value) {
        System.out.println("The task that the Left Button will perform is: "+value);    
    }

    @Override
    public void rightButton(String value) {
        System.out.println("The task that the Right Button will perform is: "+value);
        
    }

    // Overriding methods of Keyboard(abstract) below:
    @Override
    public void keyboardWithNumericPad(boolean Yes_No) {
        if(Yes_No == true){
            System.out.println("You have a good Choice");
        }else{
            System.out.println("You have a good Preference");
        }
        
    }

    @Override
    public void keyboardWithoutNumericPad(boolean Yes_No) {
        if(Yes_No == true){
            System.out.println("You have a good Preference");
        }else{
            System.out.println("You have a good Choice");
        }
    }

    // Created an extra "main" method to display/check the values 
    public static void main(String[] args) {
        Computer a = new Computer(5,'A'); 
        System.out.println();

        Compute();
        System.out.println();

        a.leftButton("Open Telegram");
        System.out.println();

        a.rightButton("Open Gallery");
        System.out.println();

        a.keyboardWithNumericPad(true);
        System.out.println();
    }
}
