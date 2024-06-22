import java.util.*;
class Lader
{
public static void main(String args[])
{
int a,b,c,d,per;
Scanner sc=new Scanner(System.in);
System.out.println("Enter four no");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
per=(a+b+c+d)/4;
if(per>=75)
{
System.out.println("HONOURS");
}
else if(per>=60)
{
System.out.println("FIRST");
}
else if(per>=50)
{
System.out.println("SECOND");
}
else if(per>=40)
{
System.out.println("THIRD");
}
else if(per<=30)
{
System.out.println("FAILED");
}
}
}