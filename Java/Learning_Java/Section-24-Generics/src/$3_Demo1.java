class Data<T>{
    private T object;

    public void setObject(T value){
        object = value;
    }

    public T getObject(){
        return object;
    }
}

public class $3_Demo1 {
    public static void main(String[] args) {

        // 1
        // * Data<Integer> dat = new Data<Integer>(); Old Method
        Data<Integer> dat = new Data<>();

        dat.setObject(12);
        System.out.println(dat.getObject());



        // 2
        Data<String> dat2 = new Data<>();
        dat2.setObject("String");
        System.out.println(dat2.getObject());


        // By using generics we can get/set any type of data

    }
}
