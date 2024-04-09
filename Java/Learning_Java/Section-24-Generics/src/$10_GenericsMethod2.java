// Bound Types in method
public class $10_GenericsMethod2 {
    static <T extends Number> void show(T[] list){
        for(T x: list){
            System.out.println(x);
        }
    }


    public static void main(String[] args) {
//        show(new String[]{"HI","Kunjesh", "Ramani"});
        show(new Integer[]{1,2,3});
    }
}
