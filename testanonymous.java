class outer
{
int x=10;
void show()
{
System.out.println(x);
System.out.println("I am outer class");
}
}
class testanonymous
{
public static void main(String arg[])
{
outer ob1=new outer()
{
void show()
{
System.out.println("I am inner class");
}
};
ob1.show();
outer ob2=new outer();
ob2.show();
}
}