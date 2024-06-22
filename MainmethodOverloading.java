class Demo
{
int a,b;
double c;
void calc(int x)
{
a=x;
System.out.println("***********************************");
System.out.println("Square of a"+(a*a));
}
void calc(int x,int y)
{
a=x;
b=y;
System.out.println("************************************");
System.out.println("Area of rectangle"+(a*b));
}void calc(int x,double y)
{
a=x;
c=y;
System.out.println("************************************");
System.out.println("Addition is"+(a+b));
System.out.println("Substration is"+(a-b));
System.out.println("Multipication is"+(a*b));
System.out.println("Division is"+(a/b));
}
}
class MainmethodOverloading
{
public static void main(String args[])
{
Demo obj=new Demo();
obj.calc(5);
obj.calc(20,10);
obj.calc(50,12.76);
}
}
