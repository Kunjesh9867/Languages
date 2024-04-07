 class Rectangle{
    public double length;
    public double breadth;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
public class PracticeRectangleMain {
    public static void main(String[] args) {
        Rectangle rec= new Rectangle();
        rec.length = 1.0;
        rec.breadth = 2.0;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
    }

}
