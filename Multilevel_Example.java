// Multilevel inheritacns in java
class Calculator
{
int a,b;
void disp(int x,int y)
{
a=x;
b=y;
System.out.println("**********************");
System.out.println("Value of a is"+a);
System.out.println("Value of a is"+b);
}
}
class Airthmetic extends Calculator 
{
int c;
void calc(int x,int y)
{
a=x;
b=y;
System.out.println("**********************");
System.out.println("Addition is"+(a+b));
System.out.println("Multiplication is"+(a*b));
System.out.println("Substraction is"+(a-b));
System.out.println("Division is"+(a/b));
}
}
class Power extends Airthmetic 
{
void square(int x)
{
c=x;
System.out.println("***********************");
System.out.println("Square of c is"+(c*c));
}
}
class Multilevel_Example
{
public static void main(String args[])
{
Power pw=new Power();
pw.disp(79,89);
pw.calc(50,8);
pw.square(10);
}
}

