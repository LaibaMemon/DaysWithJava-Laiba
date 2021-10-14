import java.io.*;

class BufferReaderEx
{
	public static void main(String args[])
	{
	  try
	  {
       FileReader fr=new FileReader("E://Data6.txt");
       BufferedReader br=new BufferedReader(fr);

       String nextLine;
       while((nextLine=br.readLine())!=null)
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