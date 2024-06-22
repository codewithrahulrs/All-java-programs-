import java.util.*;
class Fabonacciseries
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=0;
int b=1;
int c=0;
System.out.println("Enter a no");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
c=a+b;
System.out.println(c);
if(i<a)
System.out.println(",");
a=b;b=c;
}
}
}