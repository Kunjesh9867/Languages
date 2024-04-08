// InputStream
// Methods covered: read(int b), read(byte[] b)

// Reader

import java.io.FileReader;

public class FileExample2$6 {
    public static void main(String[] args) throws Exception {


        // Method: read(byte[] b)
        /*
        try{
            FileInputStream fis = new FileInputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/x.txt");
            byte[] b = new byte[fis.available()];
            fis.read(b); // This is Important
            String s = new String(b);
            System.out.println(s);
            fis.close();
        }catch (Exception e){
            System.out.println(e);
        }
        */


        // Method: read()
        /*
        try{
            FileInputStream fis = new FileInputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/x.txt");
            int x;

            do{
                x = fis.read(); // Read the ASCII code (not length)
                if(x!= -1){ // Extra condition => We can also run while loop
                    System.out.print((char)x);
                }
            }while(x!=-1);

        }catch (Exception e){
            System.out.println(e);
        }

        */



        // Using Reader (Same as InputFileStream)
        try{
            FileReader fis = new FileReader("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/x.txt");
            int x;

            do{
                x = fis.read(); // Read the ASCII code (not length)
                if(x!= -1){ // Extra condition => We can also run while loop
                    System.out.print((char)x);
                }
            }while(x!=-1);

        }catch (Exception e){
            System.out.println(e);
        }



    }
}
