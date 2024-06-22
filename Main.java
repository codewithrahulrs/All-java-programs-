interface MyInterface{
 void myMethod();
}
public class Main
{
 public static void main(String[] args){
   MyInterface obj=new MyInterface(){
   @Override
   public void myMethod(){
     System.out.println("MyMethod implementain in anonymous class");
}
};
obj.myMethod();
}
} 