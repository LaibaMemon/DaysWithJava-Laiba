class Even implements Runnable
{

	public void run()
	{
	   try
	   {
	      for(int i=2;i<=50;i++)
	      {
	         if(i%2==0)
	         {
	             System.out.println("Even no"+i);
	         }
	      }
	   }
	   catch(Exception e)
	   {
	      System.out.println(e);
	   }
	}
}

class Main
{
	public static void main(String args[])
	{
	    Thread t=new Thread(new Even());
	    t.setEven(true);
	    t.start();
	}
}