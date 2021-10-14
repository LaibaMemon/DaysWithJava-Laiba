import java.io.*;

class DataOut
{
	public static void main(String args[])
	{
      try
      {
	   

	   DataOutputStream do=new DataOutputStream(new FileOutputStream("E//Data7.txt"));

	   do.writeDouble(8.2);
	   do.writeBoolean(true);
	   do.writeInt(34);
	   do.writeChar("L");

	   do.close();
	   

	}

	catch(IOException io)
	{
	  System.out.println(io);
	}
	}
}