class myException extends Exception
{
	myException(String s)
	{
		super(s);
	}
}
class testthrows
{
	static void valid(int age) throws myException
	{
		if(age<18)
		{
			throw new myException("Not valid");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) 
	{
		valid(13);
		System.out.println("Hello World!");
	}
}
