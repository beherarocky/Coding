class Palindrome2
{
public static void main(String arg[])
{
int num=1221;
int reverse=0,reminder;
while(num!=0)
{
reminder=num%10;
reverse=(reverse*10)+reminder;
num=num/10;
}
System.out.println("The reverse number is=reverse"+reverse);
}
} 