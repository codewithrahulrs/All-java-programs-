public class MyThread extends Thread 
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("r1");
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{
}
System.out.println("r2");
}
}
public static void main(String args[])
{
MyThread t1=new MyThread();
MyThread t2=new MyThread();
t1.start();
t2.start();
System.out.println(t1.isAlive());
System.out.println(t2.isAlive());
}
}

