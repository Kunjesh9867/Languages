import java.util.*;

public class $2_LinkedList {
    public static void main(String[] args) {
        //? add
        {
            LinkedList<Integer> arrlist1 = new LinkedList<>();
            // We cannot give the size
            // Becuase it has nodes that will be created/destroyed as soon as we add/delete the element(node)

            arrlist1.add(1);
            arrlist1.add(2);
            arrlist1.add(3);
            arrlist1.add(4);
            arrlist1.add(5);

            System.out.println(arrlist1);

        }

        //? EXTRA STUFF
        {
            LinkedList<Integer> arrlist1 = new LinkedList<>(List.of(1,2,3,4,5));

            arrlist1.addFirst(0);
            System.out.println(arrlist1); // [0, 1, 2, 3, 4, 5]

            arrlist1.addLast(120);
            System.out.println(arrlist1); // [0, 1, 2, 3, 4, 5, 120]


            arrlist1.removeFirst();
            arrlist1.removeLast();
            arrlist1.getFirst();
            arrlist1.getLast();

            System.out.println(arrlist1); // [1, 2, 3, 4, 5]

            // arrlist1.descendingIterator(); // for reverse


            System.out.println(arrlist1.peek()); // add first element: 1
            System.out.println(arrlist1.peekLast()); // display last element: 5
            System.out.println(arrlist1.poll()); // remove last 1

        }
    }
}
