// ByteArrayOutputStream

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteDemo2$2 {
    public static void main(String[] args) throws Exception {

        // Byte-by-Byte

        /*
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('A');
        bos.write('B');
        bos.write('C');
        bos.write('D');


        byte[] arr = bos.toByteArray();

        for (byte x: arr){
            System.out.print((char)x);
        }

        bos.close();
         */



        // Writing to a file
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('A');
        bos.write('B');
        bos.write('C');
        bos.write('D');

        bos.writeTo(new FileOutputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/textfiles/bytedemo2file.txt"));

        bos.close();
    }
}
