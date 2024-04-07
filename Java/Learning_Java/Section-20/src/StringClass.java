public class StringClass {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Kunjesh");

        StringBuffer sReversed = new StringBuffer("Kunjesh").reverse();
        System.out.println(s.equals(sReversed));
    }
}
