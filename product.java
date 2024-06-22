import java.util.*;
class product
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER A NUMBER");
int n=sc.nextInt();
int product=1; int n1;
while(n>0)
{
n1=n%10;
product=product*n1;
n=n/10;
}
System.out.println("PRODUCT OF ITS DIGIT IS="+product);
}
}

 
