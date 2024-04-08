import java.io.File;

public class FileDemo$9 {
    public static void main(String[] args) {
        File file = new File("G:/My Drive/GitHub/Languages/Java/Learning_Java/Section-23-Java-IO/Files");
        System.out.println(file.isDirectory()); // true
        String[] files = file.list(); // only works for directory

        for(String x: files){
            System.out.println(x);
        }


        File[] fileArray = file.listFiles();
        for(File f: fileArray){
            System.out.println(f); // Path
            System.out.println(f.getName()); // Name
            System.out.println(f.getPath()); // Path
            System.out.println(f.getAbsoluteFile());
            System.out.println(f.isFile()); // true
        }


    }
}
