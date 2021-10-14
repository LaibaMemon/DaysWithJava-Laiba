class MultipleCatch
{
	public static void main(String args[])
	{
	   int num1,num2;
	   try
	   {
	      num1=0;
	      num2=60/num1;
	      System.out.println(num2);

	   }
	   catch(ArithmeticException a)
	   {
	     System.out.print("Exception is zero");
	   }
	   catch(Exception e )
	   {
	   	 System.out.print("sum");
	  }
	  
	  	   
	     System.out.println("Out of catch Block");
	   
	}
}