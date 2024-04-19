public class $3_MethodOveriding {

    public $3_MethodOveriding(){
        this(1);
        System.out.println("Kunjesh");

    }

    public $3_MethodOveriding(int value){
        while (value > 0){
            System.out.println("Kunjesh Ramani");
            value--;
        }
    }

    public static void main(String[] args) {

        $3_MethodOveriding obj1 = new $3_MethodOveriding();
        // Kunjesh Ramani
        // Kunjesh

    }



}
