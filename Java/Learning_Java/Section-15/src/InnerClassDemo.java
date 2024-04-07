class Outer{
    int x=10;
    class Inner{
        int y=20;
        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }
    public void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}



public class InnerClassDemo {
    static class Kunjesh{
        
    }
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner i = new Outer().new Inner();
        System.out.println(i.y);
    }
}