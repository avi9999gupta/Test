package Com.Mypackage;

class ReuseMe
{
void fn()
{
System.out.println("com.mypackage");
}
public static void main(String a[])
{
ReuseMe r=new ReuseMe();
r.fn();
}
}


