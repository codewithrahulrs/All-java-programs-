import java.util.*;
class LogicalExample
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three no");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.println((a>b)&&(a>c));
System.out.println((a>b)||(a>c));
}
}