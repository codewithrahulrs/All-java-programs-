public class MyThread2 extends Thread
{
public void run()
{
System.out.println("r1");
try
{
Thread.sleep(500);
}
catch(InterruptedException ie){}
System.out.println("r2");
}
public static void main(String[] args)
{
MyThread2 t1=new MyThread2();
MyThread2 t2=new MyThread2();
t1.start();
try{
t1.join();
}
catch(InterruptedException ie){}
t2.start();
}
}