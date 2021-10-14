import java.io.*;


class BufferWriterEx
{
	public static void main(String args[])
	{
	 try
	 {
	   FileWriter fw=new FileWriter("E://Data5.txt");
	   BufferedWriter bw=new BufferedWriter(fw);

	   bw.write("Laiba \n Nabiha");

	   bw.newLine();
	   bw.close();
	   fw.close();
	 }


	 catch(IOException io)
	 {
	   System.out.println(io);
	 }
	}
}

