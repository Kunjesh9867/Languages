class Circle {
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimter(){
        return  2*Math.PI*radius;
    }
    public double circumference(){
        return perimter();
    }
}


class Cylinder extends Circle{
    public double height;

    public double area(){
        return 0.0;
    }
    public double volume(){
        return area()*height;
    }
}

public class TestCode1 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height = 10;
//        System.out.println("Volume: "+c.volume());
        System.out.println("Area: "+c.area());
    }
}