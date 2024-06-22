import java.util.*;
class Selectionsort
{
public static void main(String args[])
{
int i,j,temp;
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 element");
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter elements");
for(i=0;i<5;i++)
{
System.out.print(a[i]+"\t");
}
System.out.println();
for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<5;i++)
{
System.out.print(a[i]+"\t");
}
System.out.println();
}
}

