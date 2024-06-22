class Demo_Throw
{
public static void eligble(int a)
{
if(a<18)
{
throw new ArithmeticException("Not eligble to void");
}
else
{
System.out.println("Welcome to vote");
}
}
public static void main(String args[])
{
eligble(16);
}
}
