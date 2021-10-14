interface print
{
	public void Sum();
}
class show implements print 
{
	public void Sum()
	{
	   System.out.println("YES");
	}
}
class test implements print
{
	public void Sum()
	{
	System.out.println("Yes");
	}
}

class Main1
{
	public static void main(String args[])
	{
	    print p=new test();
	    p.Sum();
	}
}