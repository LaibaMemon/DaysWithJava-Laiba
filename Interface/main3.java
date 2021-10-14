interface printtable
{
	public void Sum();
}
interface showtable
{
	public void Inter();
}
class B implements printtable,showtable
{
	public void Sum()
	{
	System.out.println("laiba");
	}

	public void Inter()
	{
	  System.out.println("nabiba");
	}
}

class main3
{
	public static void main(String args[])
	{
	   showtable p=new B();
	   p.Inter();

	   printtable o=new B();
	   o.Sum();
	}
}