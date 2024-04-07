public class String2 {
    enum Dept{
        CS,IT,CIVIL,ECE
    }

    public static void main(String[] args) {
        Dept d = Dept.CS;
        System.out.println(d.getClass().getSimpleName());
        System.out.println(d.ordinal());

    }
}
