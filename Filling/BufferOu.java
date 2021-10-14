import java.io.*;

class BufferOu
{
	public static void main(String args[])
	{

	 try
	 {
	    FileOutputStream os=new FileOutputStream("E://Data1.txt");
	    BufferedOutputStream bout= new BufferedOutputStream(os);

	    for(int i=65;i<75;i++)
	    {
	       bout.write(i);
	    }

	    bout.close();
	    os.close();
	 }

	 catch(IOException io)
	 {
	   System.out.println(io);
	 }
	}
}