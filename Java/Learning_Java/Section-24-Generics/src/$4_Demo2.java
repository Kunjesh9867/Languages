class Demo2<T>{

    private T[] arr;
    private int length;

    private int count = 0;


    public T[] getArr() {
        return arr;
    }

    public void append(T value) {
        if (arr == null) {
            arr = (T[]) new Object[length];
        }
        // System.out.println(arr.getClass().getSimpleName()); => Object
        arr[count] = value;
        count++;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }





}


public class $4_Demo2 {
    public static void main(String[] args) {

        Demo2<Integer> demo2 = new Demo2<>();

        demo2.setLength(5);


        demo2.append(1);
        demo2.append(2);
        demo2.append(3);
        demo2.append(4);
        // demo2.append(4);
        // If we dont include demo2.append(4) => null

        Object[] arr = demo2.getArr();
        for (int i = 0; i < demo2.getLength() ; i++) {
            System.out.println(arr[i]);
            // System.out.println(arr[i].getClass().getSimpleName());
        }

        /*
        * An array has a distinct type at runtime. If you create an array of Object, that is its permanent runtime type:

        * Object[] data = new Object[5];
        * System.out.println(data.getClass());    // Prints class [Ljava.lang.Object;

        * If you create an array of String, the array’s permanent runtime type is [Ljava.lang.String;.
        * If you create an array of int, the array’s permanent runtime type is [I.
        * And so on.

        * Generic types do not exist at runtime. They are a type safety mechanism enforced entirely by the compiler. This means there is no T at runtime, which means it is not possible to compile T[] because the compiler cannot generate code that creates a specific, known array type.

        * */


    }
}
