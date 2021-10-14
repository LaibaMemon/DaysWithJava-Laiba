import java.io.*;

class DtaOu
{
	public static void main(String args[])
	{
      try
      {	   
       FileOutputStream file=new FileOutputStream("E://Data7.txt");

	   DataOutputStream data=new DataOutputStream(file);
	   data.writeDouble(45.7);
	   data.writeBoolean(true);
	   data.writeInt(22);
	   data.writeChar('L');

	   data.close();
	   file.close();
	  System.out.println("Succes");
	   

	}

	catch(IOException io)
	{
	  System.out.println(io);
	}
	}
	}