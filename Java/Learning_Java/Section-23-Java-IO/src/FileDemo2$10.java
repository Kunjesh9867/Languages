import java.io.File;
import java.io.FileOutputStream;

public class FileDemo2$10 {
    public static void main(String[] args) throws Exception {
        File file = new File("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/Files/File1.txt");
        file.setReadOnly(); // read-only, we cannot write(FileOutputStream cannot be used)
        FileOutputStream fos = new FileOutputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/Files");
        // Exception: Access is Denied

        file.setWritable(true);
        FileOutputStream fos2 = new FileOutputStream("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/Files/File1.txt");
        // This works

        System.out.println(file.lastModified());

    }
}
