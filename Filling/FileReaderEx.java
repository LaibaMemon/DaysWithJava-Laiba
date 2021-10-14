import java.io.*;

class FileReaderEx
{
	public static void main(String args[])
	{
	  try
	  {
	     FileReader fd=new FileReader("E://Data4.txt");

	     int next;

	     while((next=fd.read())!=-1)
	     {
	        System.out.println((char)next);
	     }

	     fd.close();
	  }


	  catch(IOException io)
	  {
	    System.out.println(io);
	  }
	}
}