import java.io.*;

class Student3 implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;

    public Student3()
    {

    }
    public Student3(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }

    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }

}

public class ObjectDemo
{
    /*
     public static void main(String[] args) throws Exception
     {
         FileOutputStream fos=new FileOutputStream("G:\\My Drive\\GitHub\\Languages\\Java\\Learning_Java\\Section-23-Java-IO\\src\\textfiles\\Student5.txt");
         ObjectOutputStream oos=new ObjectOutputStream(fos);

         Student3 s=new Student3(10,"John",89.9f,"CSE");

         oos.writeObject(s);

         fos.close();
         oos.close();

     }

     */

    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("G:\\My Drive\\GitHub\\Languages\\Java\\Learning_Java\\Section-23-Java-IO\\src\\textfiles\\Student5.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Student3 s=(Student3)ois.readObject();

        System.out.println(s);

        fis.close();
        ois.close();

    }
}