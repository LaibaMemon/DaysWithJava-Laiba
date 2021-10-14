class invalidage extends Exception
{
	invalidage(String s)
	{
	   super(s);
	}
}
class customexception
{
	public static void main(String args[])
	{
	   int age=17;
	   try
	   {
	   if(age<18)
	   {
	      throw new invalidage("not valid");
	   }
	   }

	   catch(invalidage i)
	   {
	      System.out.println(i);
	   }
	}
}