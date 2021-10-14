class useofthrow
{
	public static void main(String args[])
	{
	   int age=17;
	   try
	   {
	       if(age<18)
	       {
	          throw new ArithmeticException("Not Eligible");
	       }


	       else
	       {
	          System.out.println("Age");
	       }
	   }

	   catch(Exception a)
	   {
	      System.out.println("nothing");
	   }
	  
	}
}