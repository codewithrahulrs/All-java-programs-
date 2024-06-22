interface A
{
abstract void dipla();
}
interface B
{
abstract void diplb();
}
class C implements A,B
{
public void dispa()
{
System.out.println("Abstract method from interface A is defined now");
}
public void dispb()
{
System.out.println("Abstract method from interface B is defined now");
}
}
class Interface_Example
{
public static void main(String args[])
{
C obj=new C();
obj.dispa();
obj.dispb();
}
}
