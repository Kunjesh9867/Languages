import java.io.RandomAccessFile;

public class RandomAccessDemo$8 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf = new RandomAccessFile("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/src/textfiles/randomAccessFile.txt", "rw");


        /*
        System.out.println(rf.readLine());
        rf.write('K');
        rf.write('U');
        rf.write('N');
        rf.write('J');
        rf.write('E');
        rf.write('S');
        rf.write('H');

         */

        // If we want to see the change, then we have to open the file
        // We cannot again use rf.readLine() because the pointer is moving


        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());

        rf.write('d');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());


        rf.seek(3); // d => You always have to count from the beginning of the file
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer() + 2); // From current position
        
    }
}
