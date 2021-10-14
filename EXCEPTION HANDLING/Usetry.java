class Usetry
{
	public static void main(String args[])
	{
	  int a[];
	  
	  try
	  {
	  	a=new int[3];
	  	int c=a[4]+a[2];
	  	
	  }
	  catch(Exception e)
	  {
	  	System.out.println("Null pointer"    +e.getMessage() );
	  }

	  
	}
}