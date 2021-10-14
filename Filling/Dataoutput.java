import java.io.*;

class Dataoutput
{
	public static void main(String args[])
	{
      try
      {
	   FileOutputStream os=new FileOutputStream("E//Data7.txt");

	   DataOutputStream do=new DataOutputStream(os);

	   do.writeDouble(8.2);
	   do.writeBoolean(true);
	   do.writeInt(34);
	   do.writeChar("L");

	   do.close();
	   os.close();

	}

	catch(IOException io)
	{
	  System.out.println(io);
	}
	}
}