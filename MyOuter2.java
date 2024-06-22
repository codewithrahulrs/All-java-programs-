public class MyOuter2
{
int x = 20;
class MyInner2
{
int x = 30;
public void showValue()
{
int x = 40;
System.out.println(x);
System.out.println(this.x);
System.out.println(MyOuter2.this.x);
}
}
public static void main(String[] args)
{
MyOuter2 ob=new MyOuter2();
MyOuter2.MyInner2 ob1 = ob.new MyInner2();
ob1.showValue();
}
}


