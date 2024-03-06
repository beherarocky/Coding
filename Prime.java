class Prime
{
public static void main(String[]arg)
{
int c=0,n,i,flag=0;
n=c/2;
if(c==0||c==1)
{
System.out.println("Enter a number other than 0 and 1");
}
else
{
for(i=2;i<=n;i++)
{
if(c%i==0)
{
System.out.println("Number is not prime");
flag=1;
break;
}
}
if(flag==0)
System.out.println("Number is prime");
}
}
}