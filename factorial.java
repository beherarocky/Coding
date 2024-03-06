import java.util.*;
class factorial
{
public static void main(String arg[])
{
int i,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:-");
int num=sc.nextInt();
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("The factorial of the number is:-"+fact);
}
}