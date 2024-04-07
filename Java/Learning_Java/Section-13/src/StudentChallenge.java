abstract class Shape{
    abstract protected double perimeter();
    abstract public double area();
}
class Circle extends Shape{
    double radius = 6.6;
    protected double perimeter(){
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    public double area(){;
        double area = Math.PI*radius*radius;
        return area;
    }
}
class Rectangle extends Shape{
    double length = 10.5;
    double breadth = 15.5;
    public double perimeter(){
        double perimeter = 2*(length+breadth);
        return perimeter;
    }

    public double area(){;
        double area = length*breadth;
        return area;
    }
}


public class StudentChallenge {

    Circle c = new Circle();
    Shape c2 = new Circle(); // Dynamic Method Dispatch
}
