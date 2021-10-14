class priority extends Thread
{
	public void run()
	{
	   try
	   {
	      System.out.println("Priority"+Thread.currentThread().getPriority());
	   }

	  finally
	  {
	  	System.out.println("yes");
	  }
	}
}

class mainPriority
{
	public static void main(String args[])
	{
	   priority t1=new priority();
	   t1.setPriority(Thread.MAX_PRIORITY);
	   t1.start();
	}
}