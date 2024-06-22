  import java.util.*;
class Bubbleshort
{
public static void main(String args[])
{
int a[]=new int[5];
int i,j,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 no");
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
System.out.println("ARRAY ELEMENT");
for(i=0;i<5;i++)
{
System.out.print(a[i]);
}
for(i=0;i<5;i++)
{
for(j=0;j<4;j++)
{ 
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("ARRAY ELEMENT AFTER BUBBLE SORT");
for(i=0;i<5;i++)
{
System.out.println(a[i]+"\t");
}
}
}
