 interface A
{
	public void Sum();
}

 class B implements A
{
	public void Sum()
	{
	   	System.out.println("Laiba");
	}
}

class Interface1
{
	public static void main(String args[])
	{
	   B ba=new B();
	   ba.Sum();
	}
}