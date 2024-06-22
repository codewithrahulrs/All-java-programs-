import java.util.*;
class Student
{
String name;
int marks;
}
class Result
{
public static void main(String args[])
{
Student ob=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NAME OF THE STUDENT");
ob.name=sc.nextLine();
ob.name=ob.name.toUpperCase();
System.out.println("ENTER THE MARKS OF THE STUDENT");
ob.marks=sc.nextInt();
System.out.println(" NAME OF THE STUDENT IS= "+ob.name);
System.out.println(" MARKS OF THE STUDENTIS= "+ob.marks);
}
}
 





