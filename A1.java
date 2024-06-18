class A1
{
class B
{
public void m1()
{
System.out.println("Inner class method");
}
}
public static void main(String[] args)
{
System.out.println("Outer class method");
A1 a=new A1();
A1.B b=a.new B();
b.m1();
}
}
 