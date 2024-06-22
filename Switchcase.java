import java.util.*;
class Switchcase
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two no");
a=sc.nextInt();
b=sc.nextInt();
char op;
System.out.println("Enter oprater");
op=sc.next().charAt(0);
switch(op)
{
 case'+':
         System.out.println("add is"+(a+b));
         break;
case'-':
         System.out.println("sub is"+(a-b));
         break;
case'*':
         System.out.println("muli is"+(a*b));
         break;
case'/':
         System.out.println("div is"+(a/b));
         break;
default:
         System.out.println("Thank You");
         break;
}
}
 }       