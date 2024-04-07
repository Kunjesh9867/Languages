public class NestedLoop {
    public static void main(String[] args) {
        // Output Question

        /*
        (1,1) (1,2) (1,3) (1,4) (1,5) (1,6) (1,7)
        (2,1) (2,2) (2,3) (2,4) (2,5) (2,6) (2,7)
        (3,1) (3,2) (3,3) (3,4) (3,5) (3,6) (3,7)
        (4,1) (4,2) (4,3) (4,4) (4,5) (4,6) (4,7)
        (5,1) (5,2) (5,3) (5,4) (5,5) (5,6) (5,7)
         */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=7 ; j++) {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println();
        }


        System.out.println();


        /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println();  // newline


        /*
        2 3 4 5 6
        3 4 5 6 7
        4 5 6 7 8
        5 6 7 8 9
        6 7 8 9 10
        */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print((j+i)+" ");
            }
            System.out.println();
        }


        System.out.println(); //newline


        /*
        1 2 3 4 5
        6 7 8 9 10
        11 12 13 14 15
        16 17 18 19 20
        21 22 23 24 25
        */
        int sum = 0;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                sum=sum+1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }


        System.out.println(); // newline


        /*
         1  2  3  4  5
         6  7  8  9 10
        11 12 13 14 15
        16 17 18 19 20
        21 22 23 24 25
         */
        int sum2 = 0;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                sum2=sum2+1;
                System.out.format("%2d ",sum2);  // c++ type
            }
            System.out.println();
        }


        System.out.println();


        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
        // Solution-1
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i==j || j<i){
                    System.out.print(j+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println(); // newline


        // Solution-2
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println();


        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */
        int sum3 = 0;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                sum3++;
                System.out.print(sum3+" ");
            }
            System.out.println();
        }


        System.out.println();


        /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */
        // Solution-1
        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println();


        // Solution-2
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j<=(5-i+1); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();


        /*
             * * * * *
             * * * *
             * * *
             * *
             *
         */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j<=5; j++) {
                if(j>=i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


        System.out.println();


        /*
            * * * * *
             * * * *
              * * *
               * *
                *
         */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j<=5; j++) {
                if(j>=i)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println();


        /*
                     *
                   * *
                 * * *
               * * * *
             * * * * *
         */
        // Solution-1
        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j<=5; j++) {
                if(j>=i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


        System.out.println();


        // Solution-2
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j<=5; j++) {
                if((i+j)> 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


        System.out.println();


        /*
                    *
                  * * *
                * * * * *
              * * * * * * *
            * * * * * * * * *
              * * * * * * *
                * * * * *
                  * * *
                    *
         */
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j<=5; j++) {
                if((i+j)>=6){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j = 6; j <=9 ; j++) {
                if((j-i)<5){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 6; i <=9 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if((i-j)<5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for (int j = 6; j <= 9; j++) {
                if((i+j)<15){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
