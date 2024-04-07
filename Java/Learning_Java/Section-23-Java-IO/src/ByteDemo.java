// ByteArrayInputStream

import java.io.ByteArrayInputStream;

public class ByteDemo {
    public static void main(String[] args) throws Exception {

        // Byte-by-Byte
        /*
        byte[] b= {'A', 'B', 'C', 'D', 'E', 'F'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        int iterator;

        while ((iterator = bis.read()) != -1){
            System.out.print((char) iterator);
        }

        bis.close();
        */


        // All Bytes at a time
        byte[] b= {'A', 'B', 'C', 'D', 'E', 'F'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        String str = new String(bis.readAllBytes());

        System.out.println(str);
        System.out.println(bis.markSupported()); // true
        bis.close();

    }
}
