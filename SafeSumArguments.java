public class SafeSumArguments
{
public static void main(String[] args)
{
int sum =0;
for(String arg: args)
{
try
{
sum+=Integer.parseInt(arg);
}
catch(NumberFormatException e)
{
System.out.println("Invalid number:" +arg);
}
}
System.out.println("Sum of valid arguments:"+sum);
}
}
