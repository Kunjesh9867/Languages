class HondaCity{
    static int x = 50;
    static class ClassStatic{
        void display(){
            System.out.println("Method of static class and variable: "+x);
        }
    }
}
public class Section16Intro {
    public static void main(String[] args) {
        HondaCity.ClassStatic c = new HondaCity.ClassStatic();
        c.display();
    }
}