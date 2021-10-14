import java.io.*;

class BufferReaderEx1
{
	public static void main(String args[])
	{
	  try
	  {
       FileReader fr=new FileReader("E://Data6.txt");
       BufferReader br=new BufferReader(fr);

       String next;
       while((next=br.read())!=null)
       {
            System.out.println("Laiba meMon");

       }

          br.close();
          fr.close();

	  }	
	  catch(IOException io)
	  {
	    System.out.println(io);
	  }

	  }
}