class WorkRunnable extends Thread
{
	WorkRunnable(String name)
	{
	super(name);
	}


	public void run()
	{
	  System.out.println("Running"+Thread.currentThread().getName());


	  try
	  {
	     Thread.sleep(1000);
	  }

	  catch(InterruptedException i)
	  {
	     System.out.println(i);
	  }

	    System.out.println("ThreadEnded"+Thread.currentThread().getName());
	}
}

class mainthreadwithextend
{
	public static void main(String args[])
	{
	  WorkRunnable w=new WorkRunnable("laiba");
	  w.start();
	}
}