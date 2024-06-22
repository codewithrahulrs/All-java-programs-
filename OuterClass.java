public class OuterClass
{
public void display()
{
class InnerClass 
{
public void msg()
{
System.out.println("I am in local inner class");
}
}
InnerClass ic = new InnerClass();
ic.msg();
}
public static void main(String[] args)
{
OuterClass oc = new OuterClass();
oc.display();
}
}

