import java.util.*;
class Parent
{
int a,b;
void disp()
{
System.out.println("Value of a is"+a);
System.out.println("Value of a is"+b);
}
}
class Child1 extends Parent
{
Child1(int x,int y)
{
a=x;
b=y;
}
void area()
{
int c=a*b;
System.out.println("Area of rectangle is"+c);
}
}
class Child2 extends Parent
{
Child2(int x,int y);
{
a=x;
b=y;
}
void add()
{
int c=a+b;
System.out.println("Addition of a and b is "+c);
}
}
class Hierachial_Example
{
public static void main(String args[])
{
Child1 ch1=new Child1(12,16);
ch1.disp();
ch1.area();
System.out.println("*************************");
Child2 ch2=new Child2(10,22);
ch2.disp();
ch2.add();
}
}