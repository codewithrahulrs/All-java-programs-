import java.util.*;
class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER A NUMBER");
int n=sc.nextInt();
int fact=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{ 
fact++;
}
}
if(fact==2)
System.out.println("NUMBER IS PRIME");
else
System.out.println("NUMBER IS NOT PRIME");
}
}