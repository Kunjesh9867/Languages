import java.util.*;
public class $4_PrirorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer>  p = new PriorityQueue<>();

        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);


        System.out.println(p.peek()); // 3

        System.out.println(p);
    }
}
