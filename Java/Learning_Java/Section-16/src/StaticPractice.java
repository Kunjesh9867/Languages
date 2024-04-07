//package staticpractice;


class My{
    static boolean s;
    static{
        System.out.println("Block 1");
//        s=10;
    }static{
        System.out.println("Block 2");
//        s=100;
    }

}
//class Test
//{
//    static int x=10;
//    int y=20;
//
//    void show()
//    {
//        System.out.println(x+" "+y);
//    }
//
//    static void display()
//    {
////        System.out.println(x+""+y); error because y is not static
//        System.out.println(x);
//    }
//}

public class StaticPractice {

    public static void main(String[] args) {

//        Test t1=new Test();
//        t1.show();
//        t1.x=30;
//        t1.y=50;
//
//        Test t2=new Test();
//        t2.show();
//        My m = new My();
        System.out.println(My.s);
    }
}