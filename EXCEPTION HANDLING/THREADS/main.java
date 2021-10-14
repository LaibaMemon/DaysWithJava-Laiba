class WorkRunnable implements Runnable
{
	   public void run()
	   {
	       System.out.println("Running"+Thread.currentThread().getName());

        
	       try
	       {
	          Thread.sleep(1000);
	       }
	       catch(InterruptedException e)
           {
              System.out.println(e);
           }

           System.out.println("threadended"+Thread.currentThread().getName());

	   }
	}


class main
{
	public static void main(String args[])
	{
	  Thread t=new Thread(new WorkRunnable());
	  t.start();
	}
}