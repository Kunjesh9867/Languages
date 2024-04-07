public class StudentChallenge2 {
    public static void main(String[] args) {
//        Student Challenge 2
        /*
        * Find if a Number is Binary or not
          Find is a Number is Hexa-Decimal or not
          Find is the data in Date format (dd/mm/yyyy)
        * */

        // For binary
        int binary = 1010;

        // Various method to convert Integer into String
        // (1)
        String str = binary+"";
        System.out.println(str);
        System.out.println(str.getClass().getSimpleName());  // It is converted into String
        // (2)
        String str2 = String.valueOf(binary);
        System.out.println(str2);

        System.out.println((Integer.toString(binary)).matches("(0|1)*"));
        //                  Integer.toString = To convert integer to string so that we can use MATCHES method

        // for Hexadecimal

        /*
        String hexdecimal = Integer.toHexString(500);
        System.out.println(hexdecimal);

        String hex = "1f4";
        System.out.println(Integer.parseInt(hex,16));
         */

        String hex = "1A4";
        System.out.println(hex.matches("[0-9A-F]*"));


        // for Date (Format: dd/mm/yyyy)
        String date = "39/12/2023";
        System.out.println("Date matching : "+date.matches("[0-3][0-9]/[0-1][0-2]/[0-2][0-9][0-9][0-9]"));



    }
}
