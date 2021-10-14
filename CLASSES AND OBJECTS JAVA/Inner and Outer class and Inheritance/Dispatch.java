class A
{
	public void callMethod()
	{
	   System.out.println("A's Method");
	}
}

class B extends A
{
	public void callMethod()
	{
	   System.out.println("B's Method ");
	}
}
class C extends A
{
	public void callMethod()
	{
	   System.out.println("C's Method");
	}
}
class Dispatch
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		C c=new C();

		A r;
		r=a;
		r.callMethod();
		r=b;
		r.callMethod();
		r=c;
		r.callMethod();
	}
}