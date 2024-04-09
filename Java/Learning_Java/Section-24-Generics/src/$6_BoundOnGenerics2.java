// Multiple Parameter

class BoundOnGenericsDemoClass2<T, K> {
    T[] arr = (T[])new Object[5];

    public void append(int index, T element){
        arr[index] = element;
    }

    public T[] arrey(){
        return arr;
    }
}
public class $6_BoundOnGenerics2 {
    public static void main(String[] args) {
        // Integer, String
        BoundOnGenericsDemoClass2<Integer, String> x = new BoundOnGenericsDemoClass2<>();

        // Object, Object
        BoundOnGenericsDemoClass2 x2 = new BoundOnGenericsDemoClass2();




    }


}
