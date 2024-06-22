public class A2
{
class B
{
public void m1()
{
System.out.println("Inner class method");
}
}
void m2()
{
System.out.println("Outer class method");
B b=new B();
b.m1();
}
public static void main(String[] args)
{
A2 a=new A2();
a.m2();
}
}
 