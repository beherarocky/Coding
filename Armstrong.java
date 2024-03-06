class Armstrong
{
public static void main(String arg[])
{
int num=153,r,sum=0,temp=num;
while(num!=0)
{
r=num%10;
sum=sum+(r*r*r);
num=num/10;
}
System.out.println("After this the number is="+sum);
if(sum==temp)
{
System.out.println("Number is armstrong");
}
else
{
System.out.println("Number is not armstrong");
}
}
}