public class MyThread4 extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName()+"Started");
try
{
MyThread4.sleep(1500);
}
catch(InterruptedException ie){
System.out.println(ie);
}
System.out.println(Thread.currentThread().getName()+"Finished");
}
public static void main(String args[])
{
MyThread4 t1=new MyThread4();
MyThread4 t2=new MyThread4();
t1.start();
try
{
t1.join(1500);
}
catch(InterruptedException ie){}
t2.start();
}
}


