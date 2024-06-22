public class SumArguments
{
public static void main(String[] args)
{
int sum = 0;
try
{
for(String arg:args)
{
sum=sum+Integer.parseInt(arg);
}
}
catch(NumberFormatException i){}
System.out.println("Sum of arguments:"+sum);
}
}