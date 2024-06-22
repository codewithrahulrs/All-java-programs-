import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
int fact=1;
System.out.println("Enter a no");
a=sc.nextInt();
for(int i=1;i<=a;i++)
{ 
 fact=fact*i;
System.out.println(fact);
}
}
}