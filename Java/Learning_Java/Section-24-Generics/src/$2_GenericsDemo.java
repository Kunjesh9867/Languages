public class $2_GenericsDemo<T> {
    T[] data = (T[]) new Object[3]; // This is not static: Template

    public static void main(String[] args) {

        // * $2_GenericsDemo<Integer> gd = new $2_GenericsDemo<>(); // Integer type
        $2_GenericsDemo<String> gd = new $2_GenericsDemo<>(); // String type

        gd.data[0] = "Kunjesh";
        gd.data[1] = "Kantilal";
        // gd.data[2] = 2; Error, gives compile-time error
        gd.data[2] = "Ramani";






    }
}
