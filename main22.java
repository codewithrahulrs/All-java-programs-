public class main22
{
public static void main(String[] args)
{

// Create a stringBuffer object
StringBuffer sb = new StringBuffer();
int length = sb.length();
int capacity = sb.capacity();

System.out.println("Before adding any character:");
System.out.println("Length ="+length);
System.out.println("Default initial capacity="+capacity); // Capacity =16

//Adding 16 characters in the existing string buffer object.

sb.append("abcdefghijklmnop");

System.out.println("After adding 16 character:");
System.out.println("Length ="+sb.length());
System.out.println("Default initial capacity="+sb.capacity());

//Now add the 17th characters in the existing string buffer object.
sb.append("q");

System.out.println("After adding 17 character:");
System.out.println("Length ="+sb.length());
System.out.println("Default initial capacity="+sb.capacity()); // Length is 17

// Add 17 charaters to the exixting object.
sb.append("abcdefghijklmnopq");//17 character, So, total = 34 characters,

//Adding 35th character
sb.append("r");

System.out.println("After adding 35th character:");
System.out.println("Length ="+sb.length()); //length is 35
System.out.println("Default initial capacity="+sb.capacity()); //Capacity is 70
}
}



