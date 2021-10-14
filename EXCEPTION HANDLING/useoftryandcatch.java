class Useoftryandcatch
{
	public static void main(String args[])
	{
	   int a=1;
	   int b=0;
       try
       {
         int c=a/b;
       }
	   	   catch(Exception e)
	   	   {
	   	   	System.out.println("print"+e.getMessage());
	   	   }
	}
}