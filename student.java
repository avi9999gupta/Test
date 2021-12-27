class student
{
String name;
int age;
void accept(String n,int a)
{
name=n;
age=a;
}
void display()
{
System.out.println("Name is "+name);
System.out.println("Age is "+age);
}
public static void main(String a[])
{
student s1=new student();
s1.accept("Alok",21);
student s2=new student();
s1.display();
s2.display();
}
}