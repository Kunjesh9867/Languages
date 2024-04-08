// CharArrayReader

import java.io.CharArrayReader;
import java.io.IOException;

public class ByteDemo3$3 {
    public static void main(String[] args) throws IOException {
        char[] c = {'a', 'b', 'c', 'd'};
        CharArrayReader cr = new CharArrayReader(c);

        int x;
        while((x=cr.read()) !=-1){
            System.out.println((char)x);
        }

        cr.close();
    }
}
