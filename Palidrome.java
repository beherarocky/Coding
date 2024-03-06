class Palidrome
{
public static void main(String arg[])
{
int num=1221;
int temp=num;
int reverse=0,reminder;
while(temp!=0)
{
reminder=temp%10;
reverse=(reverse*10)+reminder;
temp=temp/10;
}
if(temp==reverse)
{
System.out.println("Number is palidrome.");
}
else
{
System.out.println("Number is not palidrome.");
}
}
}