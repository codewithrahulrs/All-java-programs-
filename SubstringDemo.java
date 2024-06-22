public class SubstringDemo
{
public static void main(String[] args)
{
 StringBuffer sb = new StringBuffer("PQRSTUVWXYZ");
 System.out.println("Original StringBuffer: " + sb);
 String s1 = sb.substring(3);
 System.out.println("Substring: " +s1);
 String s2 = s1.substring(2, 5);
 System.out.println("New Substring: " +s2);
}
}