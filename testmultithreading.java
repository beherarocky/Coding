class thread1 implements Runnable
{
public void run()
{
for(int i=0;i<=5;i++)
System.out.println("Rocky1:"+i);
}
}
class thread2 implements Runnable
{
public void run()
{
for(int j=0;j<=5;j++)
System.out.println("Rocky2:"+j);
}
}
class testmultithreading
{
public static void main(String arg[])
{
thread1 t1=new thread1();
thread2 t2=new thread2();
Thread ob1=new Thread(t1);
Thread ob2=new Thread(t2);
ob1.start();
ob2.start();
}
}