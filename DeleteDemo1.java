public class DeleteDemo1 
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("I hate you");
System.out.println("Original StringBuffer: " + sb);
sb.replace(2, 6, "love");
System.out.println("After replace: " + sb);
}
}
