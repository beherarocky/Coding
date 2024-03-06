abstract class A
{
abstract void p();
}
class B extends A
{
void p()
{
System.out.println("Running...");
}
}
class test
{
public static void main(String arg[])
{
A ob=new B();
ob.p();
}
}