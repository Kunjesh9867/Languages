public class MethodOverloading {
    static int max(int x,int y ){
        if(x>y)
            return x;
        else
            return y;
    }

    static float max(float x, float y){
        if(x>y)
            return x;
        else
            return y;

    }

    public static void main(String[] args) {
        int a = 5, b=10;
        System.out.println(max(5,10));
        System.out.println(max(5.5f,5.55f));

    }
}
