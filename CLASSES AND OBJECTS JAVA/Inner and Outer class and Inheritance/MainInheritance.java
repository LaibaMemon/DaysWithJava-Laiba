class A
{
	public A()
	{
	   System.out.println("Inside A's constructor");
	}
}

class B extends A
{
	public B()
	{
	   System.out.println("Inside B's contructor");
	}
}
class C extends B
{
	public C()
	{
	   System.out.println("Inside C's constructor");
	}
}

class MainInheritance
{
	public static void main(String args[])
	{
	   C c=new C();
	}   
}
