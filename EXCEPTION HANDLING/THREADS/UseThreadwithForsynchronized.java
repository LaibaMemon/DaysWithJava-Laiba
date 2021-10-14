class PrintDemo
{
	public synchronized void printCount()
	{
	   for(int i=5;i>0;i--)
	   {
	   	synchronized(this)
	   	{
	     System.out.println(i);
	   	}
	   }
	}
}

class ThreadDemo extends Thread
{
	PrintDemo p;              //instance variable
    ThreadDemo(String name,PrintDemo p)                 //constructor
    {
         super(name);
         this.p=p;
    }

    public void run()
    {
       System.out.println("Starting "+getName());

       p.printCount();

       System.out.println("Ending "+getName());
    }
}

class UseThreadwithForsynchronized
{
	public static void main(String args[])
	{
	   PrintDemo p=new PrintDemo();
	   ThreadDemo t1=new ThreadDemo("Laiba",p);
	   ThreadDemo t2=new ThreadDemo("Memon",p);
	   t1.start();
	   t2.start();
	}
}