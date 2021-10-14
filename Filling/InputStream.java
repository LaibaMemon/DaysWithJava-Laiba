import java.io.*;

class InputStream
{
	public static void main(String args[])
	{


	try
	{
	   FileInputStream is=new FileInputStream("E://Data.txt");
	   int next;
	   while((next=is.read())!=-1)
	   {
	     System.out.println((char)next);
	   }
	   is.close();
	}


	catch(IOException io)
	{
	  System.out.println(io);
	}
	}
}