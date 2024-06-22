import java.util.*;
class Armstorng
{
public static void main(String args[])
{
int n,sum=0,rem,temp;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER A NUMBER");
n=sc.nextInt();
temp=n;
while(n>0)
{
rem=n%10;
sum=sum+rem*rem*rem;
n=n/10;
}
if(temp==sum)
System.out.println("Number is armstong"+sum);
else
System.out.println("Number is not armstong"+sum);
}
}
