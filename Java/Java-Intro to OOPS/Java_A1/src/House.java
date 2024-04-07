public class House {

    //Initialize 3 instance variable with different datatype and assessibility
    public int i = 10;
    private String s = "Kunjesh";
    protected float f = 12.5f;



    // I have made 16 different constructors of House class
    public  House() {   // default constructor
    }

    public House(int j) {
        this.i=j;
    }
    
    public House(String s) {
        this.s = s;

    }

    public House(float f) {
        this.f = f;
    }

    public House(int i, float f) {
        this.i = i;
        this.f = f;
    }

    public House(float f, int i) {
        this.i = i;
        this.f = f;
    }

    public House(float f, String s) {
        this.f = f;
        this.s = s;
    }

    public House(String s, float f) {
        this.f = f;
        this.s = s;
    }

    public  House(String s, int i) {
        this.i = i;
        this.s = s;
    }

    public House(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public  House(int i, float f, String s) {
        this.i = i;
        this.f = f;
        this.s = s;
    }

    public House(int i, String s, float f) {
        this.i = i;
        this.f = f;
        this.s = s;
    }

    public  House(float f, int i, String s) {
        this.i = i;
        this.f = f;
        this.s = s;
    }

    public House(float f, String s, int i) {
        this.i = i;
        this.f = f;
        this.s = s;
    }

    public  House(String s, int i, float f) {
        this.i = i;
        this.f = f;
        this.s = s;
    }

    public House(String s, float f, int i) {
        this.i = i;
        this.f = f;
        this.s = s;
    }


    // This is the getter part by which the value will be displayed in the HouseRunner file
    public int getInteger() {
        return i;
    }

    public float getFloat() {
        return f;
    }
    public String getString() {
        return s;
    }
}
