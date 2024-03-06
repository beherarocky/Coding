import java.util.*;
class Pyramid1
{
public static void main(String arg[])
{
int i,j,k,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:-");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(k=n;k>i;k--)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}