package Inheritance;

public class UIControl {
    private boolean isEnable = true;

    public void enable(){
         isEnable = true;
    }

    public void disable(){
        isEnable = false;
    }


    public boolean isEnable(){
        return isEnable;
    }


    @Override
    public String toString(){
        return "This is a UIControl class";
    }

}
