import java.util.*;
class OneDarraysum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE SIZE OF YOUR ARRAY");
int n=sc.nextInt();
int a[]=new int[n];
int i,sum=0;
System.out.println("Enter  no\n");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum+=a[i];
}
System.out.print("sum ="+sum);

}
}