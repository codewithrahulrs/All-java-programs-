public class ExceptionExample
{
public static void validateAge(int age)throws IllegalArgumentException
{
if(age<18)
{
throw new IllegalArgumentException("Age must be 18 or above to vote");
}
else
{
System.out.println("Eligible to vote");
}
}
public static void main(String[] args)
{
try
{
validateAge(16);
}
catch(IllegalArgumentException e)
{
System.out.println("Exception caught:"+e.getMessage());
}
try
{
validateAge(20);
}
catch(IllegalArgumentException e)
{
System.out.println("Exception caught:"+e.getMessage());
}
}
}

