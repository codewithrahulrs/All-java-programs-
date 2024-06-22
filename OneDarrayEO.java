import java.util.*;
class OneDarrayEO
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER SIZE OF ARRAY");
int n=sc.nextInt();
int a[]=new int[n];
int i,e=0,o=0;int sum=0;
System.out.println("Enter  no\n");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum+=a[i];
if(a[i]%2==0)
e++;
else
o++;
}
System.out.println("EVEN="+e);
System.out.println("ODD="+o);
System.out.println("SUM="+sum);

}
}