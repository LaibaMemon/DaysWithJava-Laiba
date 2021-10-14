class c
{
	public static void main(String args[])
	{
	   int []num1,num2;

	   try
	   {
	      num1=new int[5];
	      System.out.println(num1[5]);
	   }
	  catch(NullPointerException a)
	   {
	     System.out.println("zero");
	   }

	   catch(Exception b)
	   {
	    System.out.println("Bound to index");
	   }


	    System.out.println("Out off catch");
	}
}