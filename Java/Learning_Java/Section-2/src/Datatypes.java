public class Datatypes {
    public static void main(String[] args) {
        // There is no code in Datatype class
        // Moving to DataSizeRange
        System.out.println("Integer Minimum Value: "+Integer.MIN_VALUE);
        System.out.println("Integer Maximum~ Value: "+Integer.MAX_VALUE);
        // DataSizeRange notes taken
        // Moving to variables
        byte b;
        // System.out.println(b); //Error
        b=5;
        System.out.println(b);

        // Moving to Rules
        short Datatypes = 55;
        System.out.println(Datatypes);

        //Moving to Literals

        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0XA;


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        // b1,b2,b3,b4 will display the same output
        // They are in different number system

        // IMP = you can use _ to separate long number value
        long l = 123_345_232L;
        System.out.println(l);

        // long l2 = 999_999_999_;
        // long l3 = 999_999_999_._54;
        // long l4 = 999_999_999._54;
        // l2,l3,l4 is illegal as it is of NO USE


        //Check Binary Bits of an Integer
        // RUN javap java.lang.Integer in Terminal
        int integer = 5;
        System.out.println(Integer.toBinaryString(integer));

        int integer2 = -5;
        System.out.println(Integer.toBinaryString(integer2));

        char gujarati = 0x0A95;
        char gujarati2 = 0x0AC1;
        System.out.println(gujarati);
        System.out.println(gujarati2);
    }
}
