class Student 
{
int m1,m2;
void getdata(int a,int b)
{
m1=a;
m2=b;
}
void putdata()
{
System.out.println("Student first subjet marks is "+m1);
System.out.println("Student second subjet marks is "+m2);
}
}
interface Sport
{
final int SP=87;
abstract void spmarks();
}
class Detail extends Student implements Sport
{
public void spmarks()
{
System.out.println("Student Sports marks is "+SP);
}
void disp()
{
int total = m1+m2+SP;
putdata();
spmarks();
System.out.println("Student total subjet marks is "+total);
}
}
class Interfacemultiple 
{
public static void main(String args[])
{
Detail obj=new Detail();
obj.getdata(87,46);
obj.disp();
}
}
