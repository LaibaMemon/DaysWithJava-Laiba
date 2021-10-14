class Isalive extends Thread
{
	public void run()
	{
	   try
	   {
	      Thread.sleep(1000);
	   }

	   catch(InterruptedException i)
	   {
	      System.out.println(i);
	   }
	}
}

class mainalive
{
	public static void main(String args[])
	{
	  Isalive t1=new Isalive();
	  System.out.println("Before Starting thread is alive()"+t1.isAlive());
	  t1.start();

	}
}
