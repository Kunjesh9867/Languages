import java.util.*;

public class $3_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        System.out.println(dq); // [10, 20, 30, 40]
        /**
         *  As it is written in the documentation that the ArrayDeque takes the constant time for all operation
         *  We assume that the offerLast, offerFirst, etc start adding and deleting the element from the middle of array
         */


        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);


        System.out.println(dq); // [4, 3, 2, 1, 10, 20, 30, 40]





    }
}

