class Joining extends Thread
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
class mainJoining
{
	public static void main(String args[])
	{
	    Joining t1=new Joining();
	    t1.start();

	    Joining t2=new Joining();

	    try{
	    	t2.join();
	    }
	    catch(InterruptedException i){System.out.println(i)}
	    t2.start();

	}
}