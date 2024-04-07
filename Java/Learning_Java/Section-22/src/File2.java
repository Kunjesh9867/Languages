interface MyLambda2 {
    public void display();
}


public class File2 {
    public static void main(String[] args) {
        /*
        MyLambda m = new MyLambda() {
            @Override
            public void display() {
                System.out.println("Hello World");
            }
        };
        */


        MyLambda2 m = () -> {
            System.out.println("Hello World");
        };
    }
}