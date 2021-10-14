class nestedtrycatch
{
	public static void main(String args[])
	{
	  int []num1;
	  int num2;

	  try
	  {
	     try
	     {
	        num1=new int[4];
	        System.out.println(num1[4]);
	     }

	     catch(Exception b)
	     {
	        System.out.println("nested except");
	     }
	         num2=2;
	         num2=2/0;
	         System.out.println(num2);
	  }


	  catch(Exception a )
	  {
	     System.out.println("the try of 1 execute");
	  }
	}
}