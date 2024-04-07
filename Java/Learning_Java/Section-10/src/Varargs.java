public class Varargs {
    static void show (int ...num){
        for (int x:num) {
            System.out.println(x);
        }
    }

    public static void main(String ...args) {
        show(); // nothing
        show(1,2,3,4,5,6);
        show(new int[] {10,20,30});  // anonymous array


    }
}
