// No Parameter
class BoundOnGenericsDemoClass<T> {
    T[] arr = (T[])new Object[5];

    public void append(int index, T element){
        arr[index] = element;
    }

    public T[] arrey(){
        return arr;
    }
}


public class $5_BoundOnGenerics {
    public static void main(String[] args) {
        BoundOnGenericsDemoClass<Integer> x = new BoundOnGenericsDemoClass<>();
        x.append(0,54);
        x.append(3,54);

        Object[] array =  x.arrey();

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }



        //? No Parameter
        BoundOnGenericsDemoClass b = new BoundOnGenericsDemoClass(); // Object, like below
        BoundOnGenericsDemoClass<Object> b2 = new BoundOnGenericsDemoClass<>(); // Object



    }
}
