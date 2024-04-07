class Rectangle{
    private int length;
    private int breadth;

    int getLength(){
        return length;
    }
    void setLength(int l){
        length = l;
    }

}
public class DataHiding {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Rectangle r = new Rectangle();

        r.setLength(10);
        System.out.println(r.getLength());
    }
}