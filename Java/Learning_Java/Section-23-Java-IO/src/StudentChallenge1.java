// Copy content from 1 file and pasting it into another

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class StudentChallenge1 {
    public static void main(String[] args) throws Exception{

        /*
        FileInputStream fis = new FileInputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/StudentChallenge1File1.txt");
        byte[] b = new byte[fis.available()];
        fis.read(b);
        String inputString = new String(b);
        String toLower = inputString.toLowerCase();


        fis.close();


        FileOutputStream fos = new FileOutputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/StudentChallenge1File2.txt");

        byte[] b2 = toLower.getBytes();
        fos.write(b2);

        fos.close();


        */


        FileInputStream fis = new FileInputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/StudentChallenge1File1.txt");


        FileInputStream fis2 = new FileInputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/StudentChallenge1File2.txt");


        SequenceInputStream fis3 = new SequenceInputStream(fis, fis2);



        FileOutputStream fos = new FileOutputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/StudentChallenge1File3.txt");


        int x;

        while((x=fis3.read())!=-1){
            fos.write(x);
        }

        fis.close();
        fis2.close();
        fis3.close();
        fos.close();









    }
}
