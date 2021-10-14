import java.io.*;

class FileWriterEx
{
	public static void main(String args[])
	{

	  try
	  {
	    FileWriter fw=new FileWriter("E://Data3.txt");

	     fw.write("Laiba");
         fw.close();
	  }

	  catch(IOException io)
	  {
	   System.out.println(io);
	  }

	}
}