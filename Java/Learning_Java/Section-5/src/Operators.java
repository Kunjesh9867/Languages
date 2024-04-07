public class Operators {
    public static void main(String[] args) {
        byte b1 = 5;
        System.out.println(b1);
        // Student Challenge
        int l = 10, h = 12;
        System.out.println("Area of Triangle: "+(0.5*l*h));

        //Area with different sides
        float a = 5.5f, b = 3.6f, c = 7.8f;
        float s = 0.5f*(a+b+c);
        double formula = Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);  // power
        double formula2 = Math.sqrt((s*(s-a)*(s-b)*(s-c)));    // sqrt
        System.out.println(formula);
        System.out.println(formula2);
        System.out.println("Hello WOrld");




    }
}