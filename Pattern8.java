import java.util.*;
class Pattern8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int i,j;
for(i=1;i<=5;i++)
   {
    for(j=1;j<=6-i;j++)
   {
    System.out.print("*");
}
System.out.println();
}
}
}