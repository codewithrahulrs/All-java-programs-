import java.util.*;
class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER A NUMBER");
int n=sc.nextInt();
int sum=0; int n1;
while(n>0)
{
n1=n%10;
sum=sum+n1;
n=n/10;
}
System.out.println("SUM OF ITS DIGIT IS="+sum);
}
}

 
