public class LengthCapdemo1
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("Hello World! ");
System.out.println("Original string:"+sb);
int length =sb.length();
int capacity =sb.capacity();
System.out.println("Length of StringBuffer: " +length);
System.out.println("Capacity of StringBuffer: " +capacity);

sb.ensureCapacity(40);
System.out.println("Now, capacity:" +sb.capacity());

sb.setLength(15);
System.out.println("Now, length:" +sb.length());

}
}

