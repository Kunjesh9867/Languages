//package scstatic1;

import java.util.Date;

class Student
{
    private String rollNo;

    public static  int x =10;


    private static int count=1;

    private String assignRollNo()
    {
        Date d=new Date();

        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    Student()
    {
        rollNo=assignRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }

}

public class StudentChallengeROLL
{
    static public void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();


        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());

    }
}