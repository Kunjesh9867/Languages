import java.io.BufferedReader;
import java.io.FileReader;

public class BufferDemo$4 {
    public static void main(String[] args) throws Exception{

        // General

        /*
        FileInputStream fis = new FileInputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/textfiles/bytedemo2file.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int x;
        while ((x=bis.read()) != -1){
            System.out.println((char)x);
        }


        System.out.println("File: "+ fis.markSupported());
        System.out.println("Buffer: "+ bis.markSupported());

         */


        // Use of BufferInputStream
        /*
        FileInputStream fis = new FileInputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/textfiles/StudentChallenge1File2.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);


        // HELLO, MY NAME IS KUNJESH RAMANI.
        System.out.println((char) bis.read()); // H
        System.out.println((char) bis.read()); // E
        System.out.println((char) bis.read()); // L

        bis.mark(10); // Vaid for 10 min

        System.out.println((char) bis.read()); // L
        System.out.println((char) bis.read()); // O

        bis.reset(); // goes to the mark (here, L)

        System.out.println((char) bis.read()); // L
        System.out.println((char) bis.read()); // O

         */





        // BuffereReader(Same as BufferInputStream)
        FileReader fis = new FileReader("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/textfiles/StudentChallenge1File2.txt");
        BufferedReader bis = new BufferedReader(fis);


        // HELLO, MY NAME IS KUNJESH RAMANI.
        System.out.println((char) bis.read()); // H
        System.out.println((char) bis.read()); // E
        System.out.println((char) bis.read()); // L

        bis.mark(10); // Vaid for 10 min

        System.out.println((char) bis.read()); // L
        System.out.println((char) bis.read()); // O

        bis.reset(); // goes to the mark (here, L)

        System.out.println((char) bis.read()); // L
        System.out.println((char) bis.read()); // O


        // In BufferReader, there is a method called readLine
        System.out.println(bis.readLine()); // read the remaining line
    }
}
