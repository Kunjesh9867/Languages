import java.util.*;
public class Printing {
    public static void main(String[] args) {
        // String str = new String("Kunjesh Ramani");

//        System.out.println(Integer.toString(55));
//        int i = 55;
//        String j = Integer.toString(55);
//        System.out.println(("j.getClass().getSimpleName()));
        System.out.printf("Kunjesh");
        System.out.println();
        int x = 10;
        float f = 12.56f;
        char z = 'A';
        System.out.format("Hello %1$d %1$d %2$c World",x,z);
        System.out.println();
        System.out.printf("%f",f);
    }
}