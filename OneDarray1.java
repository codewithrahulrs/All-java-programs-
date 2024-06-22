import java.util.*;
class OneDarray1
{
public static void main(String args[])
{
int a[]=new int[10];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 no\n");
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
System.out.print("ARRAY ELEMENT ARE\n");
for(i=0;i<10;i++)
{
System.out.print(a[i]+"\t");
}
}
}