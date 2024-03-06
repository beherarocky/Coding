class Reverse1
{
public static void main(String arg[])
{
int num=121;
int reverse=0,reminder;
while(num>0)
{
reminder=num%10;
reverse=reverse*10+reminder;
num=num/10;
}
System.out.println("The reverse of this number is="+reverse);
}
}