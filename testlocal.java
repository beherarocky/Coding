class outer
{
int x=10;
void show()
{
class inner
{
void msg()
{
System.out.println("Data:-"+x);
}
}
inner ob1=new inner();
ob1.msg();
}
}
class testlocal
{
public static void main(String arg[])
{
outer ob2=new outer();
ob2.show();
}
}