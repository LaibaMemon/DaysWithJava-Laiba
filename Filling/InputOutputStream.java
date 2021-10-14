import java.io.*;
class InputOutputStream
{
	public static void main(String args[])
	{


// try{    
//              FileOutputStream fout=new FileOutputStream("E:\\testout.txt");    
//              fout.write(65);    
//              fout.close();    
//              System.out.println("success...");    
//             }catch(Exception e){System.out.println(e);
//             }  

	   try
	   {
	     FileOutputStream os=new FileOutputStream("E://Data.txt");

	     for(int i=65;i<75;i++)
	     {
	        os.write(i);
	     }
	     os.close();
	   }


	   catch(IOException io)
	   {
	   System.out.println(io);
	   }
	}
}