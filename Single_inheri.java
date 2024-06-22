import java.util.*;
class Student
{
String name;
int roll;
double m1,m2,m3;
void percentage(int a,int b,int c)
{
m1=a;m2=b;m3=c;
double total =(m1+m2+m3)/3;
System.out.println("Student percentage is"+total+"%");
}
}
class Detail extends Student
{
Detail(String n,int r)
{
name =n;
roll=r;
}
void disp()
{
System.out.println("Student name is"+name ); 
System.out.println("Student name is"+roll );
}
}
class Single_inheri
{
public static void main(String args[])
{
Detail ob=new Detail("Rahul",101);
ob.disp();
ob.percentage(67,69,78);
}
}