import java.util.*;
class Constructor
{
int a,b;
Constructor()
{
System.out.println("Default constructor invoked");
}
void Add()
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE VALUE OF A AND B");
int a=sc.nextInt();
int b=sc.nextInt();
int c=a+b;
System.out.println("Add two no is\n"+c);
}
}
class Defaultconstructor
{
public static void main(String args[])
{
Constructor obj=new Constructor();
obj.Add();
}
}
