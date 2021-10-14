class ArgPass
{
	private int a;
	public ArgPass(int i)
	{
	     a=i;
	}
	public void passvalue(int i)
	{
	    i=20;
	    System.out.println(i);
	}
	public void passobj(ArgPass obj)
	{
	   obj.a=30;
	   System.out.println(obj.a);
	}
}
class MainArgPass
{
	public static void main(String args[])
	{
	   int var=20;
	   ArgPass object=new ArgPass(10);
	   ArgPass object2=new ArgPass(var);
	   object.passvalue(var);
	   object.passobj(object2);
	   System.out.println(var);


	}
}