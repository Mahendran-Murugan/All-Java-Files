import java.util.*;

class Student
{
    int roll=22;
    String name="Student 1 ";
    public void intro()
    {
        System.out.print("My name : "+name +"\n" +"Roll Number : "+ roll);
    }
}

public class Class_Program
{
    public static void main (String[] args) {
    
        Student std = new Student();
        std.intro();
    }
}