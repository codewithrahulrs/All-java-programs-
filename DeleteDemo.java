public class DeleteDemo 
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("I love mango");
System.out.println("Original StringBuffer: " + sb);
sb.delete(0,7);
System.out.println("After delete: " + sb);
sb.deleteCharAt(1);
System.out.println("After deleteCharAt: " + sb);
}
}
