public class StringObject {
    public static void main(String[] args) {
        char[] c = {'A','B','C','D'};
        System.out.println(c.getClass().getSimpleName());
        String str = new String(c);
        System.out.println(str);
    }
}
