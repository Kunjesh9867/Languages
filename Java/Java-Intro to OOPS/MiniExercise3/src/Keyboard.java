public abstract class Keyboard {
    // 2 instance variables are created below with proper naming:
    private int digit = 5;
    private char letter = 'A' ;


    // I have created a total of 2 abstract methods below:
    public abstract void keyboardWithNumericPad(boolean Yes_No);
    public abstract void keyboardWithoutNumericPad(boolean Yes_No);
    


    // I have created a total of 3 constructor below:
    public Keyboard(int digit, char letter){
        this.digit = digit;
        this.letter = letter;
    }public Keyboard(int digit){
        this.digit = digit;
    }public Keyboard(char letter){
        this.letter = letter;
    }

    // I have created a total of 4 concrete methods below:
    public void getDigit(){
        System.out.println(digit);
    }
    public void getLetter(){
        System.out.println(letter);
    }
    public void setDigit(int digit){
        this.digit = digit;
    }
    public void setLetter(char letter){
        this.letter = letter;
    }
}
