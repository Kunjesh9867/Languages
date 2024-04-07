public class RegularExpression {
    public static void main(String[] args) {
        String str = "A$";
        System.out.println(str.matches("[ABC][\\w]"));
        String str2 = "abb77777777";
        System.out.println(str2.matches("[abc]*[0-7]*"));

        System.out.println();
        String str3 = "accbaaa";
        System.out.println("Hello "+str3.matches("[abc]{3,7}"));

        String str4 = "aaa ";
        System.out.println("str4: "+str4.matches("[abc]{3}"));

        String email = "kunjeshramani@gmail@gmail.com";
        System.out.println("Email : "+email.matches(".*@gmail.*[.com]")); //Wrong
        System.out.println("Email : "+email.matches(".*@gmail[.com]")); // Right


        // Student Challenge
        /*
        * Find if the email is on gmail
        * Find username and domain name from email
        * */

        String gmail = "kunjeshramani9727@gmail.com";

//        System.out.println(gmail.matches(".*@"));
        int indexOfExp = gmail.indexOf("@");
        System.out.print("Username is: ");
//        for (int i = 0; i < indexOfExp ; i++) {
//            System.out.print(gmail.charAt(i));
//        }
//        Either you can use FOR loop or SUBSTRING method
        System.out.print(gmail.substring(0,indexOfExp));

        System.out.println();

        System.out.print("Domain name is: ");
//        for checking of gmail. YOu can either use REGEX or compareTo
//        (by find the index of . and comparing the content between @ and .)
        if(gmail.matches(".*@gmail.*")){
            for (int i = indexOfExp+1; i <gmail.length() ; i++) {
                System.out.print(gmail.charAt(i));
            }
        }else{
            System.out.println("Error");
        }



    }

}
