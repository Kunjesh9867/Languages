interface MyLambda {
    public void display();
}


public class File1 {
    public static void main(String[] args) {
        /*
        MyLambda m = new MyLambda() {
            @Override
            public void display() {
                System.out.println("Hello World");
            }
        };
        */


        MyLambda m = () -> {
            System.out.println("Hello World");
        };
    }
}