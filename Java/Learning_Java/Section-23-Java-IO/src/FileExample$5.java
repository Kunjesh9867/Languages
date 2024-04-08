// OutputStream
// Methods covered: write(int b), write(byte[] b), write(byte[] b, int offset, int len)

import java.io.FileOutputStream;

public class FileExample$5 {
    public static void main(String[] args) {

        // All At a time

        /*
        try{
            // If the file is not present => It will create and write into it.
            FileOutputStream fos = new FileOutputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/x.txt");
            String str = "Learn Java Program";
            fos.write(str.getBytes());
            fos.close();
        }catch (Exception e){
            System.out.println(e);
        }
       */



        // Writing byte-by-byte
        /*
        try {
            FileOutputStream fos = new FileOutputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/x.txt");
            String str = "Learn Java Program";

            byte[] b = str.getBytes();
            for (byte x : b) {
                fos.write(x);
            }
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        */


        // Using offset & length
        /*
        try {
            FileOutputStream fos = new FileOutputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/notepad.txt");
            String str = "Learn Java Programming";

            byte[] b = str.getBytes();
            fos.write(b, 6, str.length()-6);
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        */





        // Try-with-Resource: Recommendation by Intellij
        try{
            try(FileOutputStream fos = new FileOutputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/x.txt");) {
                String str = "Learn Java Program";
                fos.write(str.getBytes());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
