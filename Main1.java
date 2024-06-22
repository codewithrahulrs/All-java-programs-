interface Myinterface
{
 void myMethod();
 default void defaultMethod(){
  System.out.println("This is a default method");
 }
 static void mainMethod()
{
 System.out.println("This is a static method");
 }
}
class MyClass implements Myinterface{
 public void myMethod(){
 System.out.println("MyMethod implementation in MyClass");
}
}
public class Main1{
 public static void main(String[] args){
 Myinterface obj=new MyClass();
 obj.myMethod();
 obj.defaultMethod();
 Myinterface.mainMethod();
}
}
 