class Wrapperclass
{
	public static void main(String args[])
	{
	   String a="123";
	   Integer i=Integer.parseInt(a);

	   if(a.equals("123"))
	   {
	       System.out.println("Equals");
	   }
	   else
	   {
	      System.out.println("Not equals");
	   }

	   if(i==(123))
	   {
	   	  System.out.println("Print");
	   }
	   else
	   {
	   	  System.out.println("Not Print");
	   }
	}
}