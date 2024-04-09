public class $9_GenericsMethod1 {
    static <T> void show(T[] list){  // We have to write <T> before returnDatatype
        for(T x: list){
            System.out.println(x);
        }
    }

//    static <T> void show(T... list){  // We have to write <T> before returnDatatype
//        for(T x: list){
//            System.out.println(x);
//        }
//    }

    public static void main(String[] args) {
        show(new String[]{"HI","Kunjesh", "Ramani"});
        show(new Integer[]{1,2,3});
    }
}
