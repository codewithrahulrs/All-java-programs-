import java.util.*;
class Sumoftowmatrix
{
public static void main(String args[])
{
int i,j,sum=0;
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
Scanner sc=new Scanner (System.in);
System.out.println("Enter 9 no MAT A\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter 9 no MAT B\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println("Enter 9 no MAT A\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("Enter 9 no MAT B\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
System.out.println("Enter 9 no MAT C\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}
}
