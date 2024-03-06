class test1 implements Runnable 
{
	public void run()
	{
		for(int i=0;i<=5;i++)
			System.out.println("Thread1:"+i);		
	}
}
class test2 implements Runnable
{
	public void run()
	{
		for(int j=0;j<=5;j++)
			System.out.println("Thread2:"+j);		
	}		
}
class testthreading
{
	public static void main(String[] args) 
	{
		test1 t1=new test1();
		test2 t2=new test2();
		Thread ob1=new Thread(t1);
		Thread ob2=new Thread(t2);
		ob1.start();
		ob2.start();
		System.out.println("Hello World!");
	}
}