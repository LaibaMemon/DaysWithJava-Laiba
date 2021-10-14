import java.util.Scanner;

class Array
{
	Scanner x=new Scanner(System.in);
	int arr[]=new int[10];
	public void setmethod()
	{
	   System.out.println("Enter the elemnets");
       for(int i=0;i<=9;i++)
       arr[i]=x.nextInt();
	}



	public void getmethod()
	{
	    for(int j=0;j<=9;j++)
	    {
	         if(arr[j]%2==0)
	    {

              System.out.println("Even="+arr[j]);
	    }
	         if(arr[j]%2!=0)
	         {
	             System.out.println("Odd="+arr[j]);
	         }
	    }
	}
}
class MainArray
{
	 public static void main(String args[])
	 {
	     Array A1;
	     A1=new Array();

	     A1.setmethod();
	     A1.getmethod();

	 }
}