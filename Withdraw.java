import java.util.Scanner;
class Withdraw
{
	
	public static void main(String args[])
	{
	    int i=1000;
	    Scanner x=new Scanner(System.in);

	    System.out.println("Enter the number the you want");

	    int a=x.nextInt();

	    a=i+a;
	    System.out.println("Increment is"+a);
	}
}