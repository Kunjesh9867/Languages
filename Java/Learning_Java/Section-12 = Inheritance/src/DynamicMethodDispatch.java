class Super{
    public void method1(){
        System.out.println("Super: method1");
    }

    void method2(){
        System.out.println("Super: method2");
    }
}

class Sub extends Super{
//    @Override
    protected void method2(){
        System.out.println("Sub: method2");
    }
    public void method3(){
        System.out.println("Sub: method3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.method1();
        s.method2();
        s.method3();
    }
}
