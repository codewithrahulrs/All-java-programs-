import java.util.*;
class Pattern6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int i,j;
for(i=1;i<=5;i++)
{ 
for(j=1;j<=5-i;j++)
{
System.out.print(" ");
}
for(j=1;j<=2*i-1;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}


