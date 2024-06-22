import java.util.*;
class Constructor
{
int a,b;
Constructor(int x,int y)
{
 a=x;b=y;
}
void add()
{
int c=a+b;
System.out.println("Add two no is\n"+c);
}
}
class Parameterized_constructor
{
public static void main(String args[])
{
Constructor obj=new Constructor(4,5);
obj.add();
}
}
