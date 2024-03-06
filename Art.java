class cse
{
int age;
String name;
int id;
cse()
{
int age;
String name;
}
cse(int a,String n)
{
age=a;
name=n;
}
cse(int a,String n,int i)
{
age=a;
name=n;
id=i;
}
void display()
{
System.out.println(age+" "+name+" "+id);
}
}
class Art
{
public static void main(String arg[])
{
cse ob1=new cse();
cse ob2=new cse(101,"Rocky");
cse ob3=new cse(102,"Pabitra",23);
ob1.display();
ob2.display();
ob3.display();
} 
}