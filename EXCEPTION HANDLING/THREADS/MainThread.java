class Runnablethread implements Runnable
{
	public void run()
	{
	 System.out.println("Thread Running");
	}
} 
public class MainThread
{
	public static void main(String args[])
	{
	   Thread t=new Thread(new Runnablethread());
	   t.start();
	}

}