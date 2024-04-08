import java.io.*;

class Student{
    int rollno;
    String name;
    String dept;
}


public class PrintStream$11 {
    public static void main(String[] args) throws Exception{



        // FileOutputStrem: PrintStream
        /*
        FileOutputStream fos = new FileOutputStream("G:\\My Drive\\GitHub\\Languages\\Java\\Learning_Java\\Section-23-Java-IO\\src\\textfiles\\Student1.txt");
        PrintStream ps = new PrintStream(fos); // To transfer in file (not in byte)



        Student s = new Student();
        s.rollno = 12;
        s.name = "Kunjesh";
        s.dept = "CSE";


        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);


        ps.close();
        fos.close();

         */

        // FileInputStrem: PrintStream

        FileInputStream fis = new FileInputStream("G:\\My Drive\\GitHub\\Languages\\Java\\Learning_Java\\Section-23-Java-IO\\src\\textfiles\\Student1.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));

        Student s = new Student();

        s.rollno = Integer.parseInt(bf.readLine());
        s.name = bf.readLine();
        s.dept = bf.readLine();

        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.dept);






        bf.close();
        fis.close();



    }
}
