// Demonstration of Abstract Class
 abstract class Super{
//    public Super(){
//        System.out.println("Super Constructor");
//    }
    public void meth1(){
        System.out.println("Meth1 of Super");
    }
    abstract public void meth2();
}

class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Sub meth2");

    }
}

public class Intro {
    public static void main(String[] args)
    {
        Sub s1 = new Sub();
//        s1.meth1();
        s1.meth2();

    }
}