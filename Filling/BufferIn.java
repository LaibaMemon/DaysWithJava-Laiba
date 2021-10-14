import java.io.*;

class BufferIn
{
	public static void main(String args[])
	{

	 try
	 {
	   FileInputStream is=new FileInputStream("E://Data2.txt");
	   BufferedInputStream bin=new BufferedInputStream(is);


	   int next;
	   while((next=bin.read())!=-1)
	   {
	     System.out.println((char)next);
	   }

         bin.close();
         is.close();


	 }

	 catch(IOException io)
	 { 
	   System.out.println(io);
	  }
	}
}