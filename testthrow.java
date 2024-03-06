class testthrow
{
static void valid(int age)
{
if(age<18)
{
throw new ArithmeticException("Not valid to give vote");
}
else
{
System.out.println("Welcome to vote");
}
}
public static void main(String arg[])
{
try
{
valid(13);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Rest of the code");
}
}