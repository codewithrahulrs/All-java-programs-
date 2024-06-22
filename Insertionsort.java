import java.util.*;
class Insertionsort
{
public static void main(String args[])
{
int i,j,temp,n,k;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER SIZE OF ARRAY");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter  elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter elements");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
System.out.println();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[j];
 for( k=j;k>i;k--)
{
a[k]=a[k-1];
}
a[k]=temp;
}
}
}
for(j=0;j<n;j++)
{
System.out.print(a[j]+"\t");
}
System.out.println();
}
}

