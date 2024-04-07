class Rectangle2{
    private double length;
    private double breadth;

    public Rectangle2(){
        length=1;
        breadth=1;
    }
    public Rectangle2(double l, double b){
        length=l;
        breadth=b;
    }
    public Rectangle2(double s){
        length=breadth=s;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(10,5);
    }
}
