class trycatchwithfinally
{
	public static void main(String args[])
	{
	  int []num1;
	  

	  
	     try
	     {
	        num1=new int[4];
	        System.out.println(num1[3]);
	     }

	     catch(Exception b)
	     {
	        System.out.println("Exception found");
	     }

	     finally
	     {  
	     	System.out.println("Exception differnet");

	       }
}
    
    } 