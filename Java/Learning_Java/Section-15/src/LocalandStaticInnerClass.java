class OuterClass{
    public void display(){
        class inner{
            public void show(){
                System.out.println("Hello");
            }
        }
//        inner i = new inner();
//        i.show();
        new inner().show();
    }
}
public class LocalandStaticInnerClass {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        o.display();


    }
}
