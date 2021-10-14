import java.io.*;

class DtaIn
{
	public static void main(String args[])
	{
      try
      {
	   
       FileInputStream file=new FileInputStream("E://Data8.txt");
	   DataInputStream ox=new DataInputStream(file);

	  
	  
	   ox.readInt();


	   ox.close();
	   file.close();
	   

	}

	catch(IOException io)
	{
	  System.out.println(io);
	}
	}
}
