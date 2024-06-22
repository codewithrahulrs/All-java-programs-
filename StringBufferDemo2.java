public class StringBufferDemo2
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("Java Programing");
System.out.println("Original StringBuffer:" +sb);

char[] c =new char[9];
sb.getChars(0,8,c,0);
System.out.println("Content of character array:");
for(int i=0;i<c.length;i++)
{
System.out.print(c[i]+ " ");
}
}
}