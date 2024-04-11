class MyArr<T> {
    T[] arr = (T[])new Object[5];


    public void append1(int index, T element){
        arr[index] = element;
    }

    public T[] arrey1(){
        return arr;
    }
}




public class $11_GenericsMethod2 {
//    static void fun(MyArr obj){
//        obj.arrey1();
//    }

//    static void fun(MyArr<?> obj){
//        obj.arrey1();
//    }

    static void fun(MyArr<? extends Number> obj){ // ? super Number
        obj.arrey1();
    }
    public static void main(String[] args) {

        MyArr<String> ex1 = new MyArr<>();
        ex1.append1(0,"Kunjesh");
        ex1.append1(0,"Ramani");

        MyArr<Integer> ex2 = new MyArr<>();
        ex2.append1(0,0);
        ex2.append1(0,1);

    }
}
