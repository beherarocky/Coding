class Palindrome5
{
public static void main(String arg[])
{
int num=124;
int temp=num;
int reverse=0,reminder;
while(num!=0)
{
reminder=num%10;
reverse=(reverse*10)+reminder;
num=num/10;
}
System.out.println("The reverse of this number is="+reverse);
if(reverse==temp)
System.out.println("The number is palindrome.");
else
System.out.println("The number is not palindrome.");
}
}