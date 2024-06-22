public class MyThread3 extends Thread
{
MyThread3(String str)
{
super(str);
}
public void run()
{
System.out.println(Thread.currentThread().getName()+"Started");
try
{
MyThread3.sleep(1500);
}
catch(InterruptedException ie){
System.out.println(ie);
}
System.out.println(Thread.currentThread().getName()+"Finished");
}
public static void main(String args[])
{
MyThread3 t1=new MyThread3("First thread ");
MyThread3 t2=new MyThread3("Second thread ");
t1.start();
t2.start();
}
}


