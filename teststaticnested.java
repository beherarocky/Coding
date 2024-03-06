class outer
{
static int x=10;
class inner
{
void show()
{
System.out.println("Data:-"+x);
}
}
}
class teststaticnested
{
public static void main(String arg[])
{
outer.inner ob=new outer().new inner();
ob.show();
}
}