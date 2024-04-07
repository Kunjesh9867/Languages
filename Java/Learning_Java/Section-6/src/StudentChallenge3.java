public class StudentChallenge3 {
    public static void main(String[] args) {
        /*
        Remove Special characters from a string
        Remove extra spaces from string
        Find number of words in a String
         */

        // (1)
        String str = "a!B@c#1$2%3";
        String str2 = str.replaceAll("\\W",""); // REPLACEALL :)
        System.out.println(str2);

        // (2)
        str = "abc   de   efg    hij";
        String str3 = str.replaceAll("\\s+"," "); // '+' for one or more
        System.out.println(str3);

        // (3)
        str = "abc   de   efg    hij";
        str = str.replaceAll("\\s+"," ").trim(); // to remove all the extra spaces
        String[] str5 = str.split("\\s");
        System.out.println(str5.length);



    }
}
