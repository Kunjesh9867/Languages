import java.util.*;

public class $1_ArrayList {
    public static void main(String[] args) {
        //? add
        {
            // ArrayList<Integer> arrlist1 = new ArrayList<>();
            ArrayList<Integer> arrlist1 = new ArrayList<>(20);
            arrlist1.add(10);
            arrlist1.add(0,5);
            arrlist1.addAll(Arrays.asList(1,2,3,4,5));
            arrlist1.addAll(List.of(1,2,3,4,5));


            ArrayList<Integer> arrlist2 = new ArrayList<>(List.of(50,60,70,80,90));
            System.out.println(arrlist2); // [50, 60, 70, 80, 90]
        }




        //? addALL
        {
            ArrayList<Integer> arrlist1 = new ArrayList<>(20);
            ArrayList<Integer> arrlist2 = new ArrayList<>(List.of(50,60,70,80,90));

            arrlist1.add(10);
            arrlist1.add(0,5);

            // arrlist1.addAll(arrlist2);
            // System.out.println(arrlist1); // [5, 10, 50, 60, 70, 80, 90]
            arrlist1.addAll(1,arrlist2);
            System.out.println(arrlist1); // [5, 50, 60, 70, 80, 90, 10]
        }

        //? contains
        {
            ArrayList<Integer> arrlist1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
            System.out.println(arrlist1.contains(1)); // true
            System.out.println(arrlist1.contains(11)); // false
        }


        //? equals
        {
            ArrayList<Integer> arrlist1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
            ArrayList<Integer> arrlist2 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

            System.out.println(arrlist1.equals(arrlist2)); // true

            arrlist1.add(2);
            System.out.println(arrlist1.equals(arrlist2)); // false
        }


        //? get
        {
            ArrayList<Integer> arrlist1 = new ArrayList<>(List.of(1,2,3,4,5));

            System.out.println(arrlist1.get(3)); // 4
            //System.out.println(arrlist1.get(5)); // Exception(IndexOutOfBound)
        }

        //? indexOf
        {
            ArrayList<Integer> arrlist1 = new ArrayList<>(List.of(1,2,3,4,5));

            System.out.println(arrlist1.indexOf(2)); // 1
            System.out.println(arrlist1.lastIndexOf(2)); // 2(We only have 1)
        }


        //? remove
        {
            ArrayList<Integer> arrlist1 = new ArrayList<>(List.of(1,2,3,4,5));

            arrlist1.remove(0); // index
            System.out.println(arrlist1); // [2, 3, 4, 5]
        }

        //? In the same way, we have
        //? (1) removeAll
        //? (2) retain
        //? (3) retainAll
        //? (4) set
        //? (5) clear
        //? (6) isEmpty
        //? (7) size



        //? Iterating/Traversing through an ArrayList
        {
            ArrayList<Integer> arrlist1 = new ArrayList<>(List.of(10,20,30,40,50));


            for (int i = 0; i < arrlist1.size(); i++) {
                // System.out.println(arrlist1[i]);  Cannot use []
                System.out.println(arrlist1.get(i));
            }

            for (int i: arrlist1) { // Integer i: arrlist1 => Sir's choice
                System.out.println(i);
                System.out.println();
            }


            Iterator<Integer> it = arrlist1.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }


            ListIterator<Integer> it2 = arrlist1.listIterator();
            while (it2.hasNext()){
                System.out.println(it2.next());
//                System.out.println(it2.previous());
            }


            arrlist1.forEach(n->{
                System.out.println(n);
            }); // We can call method and use it


            arrlist1.forEach(System.out::println); // We cannot call other methods, just SYSTEM.OUT

        }
























    }

}
