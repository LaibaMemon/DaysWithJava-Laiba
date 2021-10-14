class InvalidAgeException extends Exception
{
		InvalidAgeException(String s)
		{
		   super(s);
		}
}

class customException1
{
	static void verify(int age) throws InvalidAgeException
	{
	   if(age<18)
	   throw new InvalidAgeException("Valid");

	   else
	   System.out.println("Yes");
	}


	public static void main(String args[])
	{
	   try
	   {
	      verify(17);
	   }
	   catch(Exception e)
	   {
	     System.out.println(e);
	   }
	}
}