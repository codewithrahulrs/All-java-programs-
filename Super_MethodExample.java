import java.util.*;
class Student
{
String name ;
int roll;
double m1,m2,m3;
void disp()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter student three subject marks");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
System.out.println("Student first subject marks is"+m1);
System.out.println("Student second subject marks is"+m2);
System.out.println("Student third subject marks is"+m3);
}
}
class Data extends Student
{
Data(String n,int r)
{
name=n;
roll=r;
}
void disp()
{
super.disp();
System.out.println("Student name is"+name);
System.out.println("Student roll is"+roll);
}
}
class Super_MethodExample
{
public static void main(String args[])
{
Data obj=new Data("RAHUL",101);
obj.disp();
}
}