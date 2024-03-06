class MultipleCatchBlock
{
public static void main(String arg[])
{
//String s=null;
try
{
int A[]=new int[10];
A[10]=90;
System.out.println("Rocky Behera");
//System.out.println(s.length());
}
catch(ArithmeticException a)
{
System.out.println(a);
}
catch(ArrayIndexOutOfBoundsException a)
{
System.out.println(a);
}
catch(NullPointerException a)
{
System.out.println(a);
}
System.out.println("Rest of the code");
}
}