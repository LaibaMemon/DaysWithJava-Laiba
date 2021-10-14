import java.util.Scanner;
class InputSwitch
{
	public static void main(String args[])
	{
	   Scanner x=new Scanner(System.in);

	   System.out.println("Press 1 for case 1");
	   System.out.println("Press 2 for case 2");


	   int a=x.nextInt();

	   switch(a)
	   {
	     case 1:
	     System.out.println("This is case 1");
	     break;

	     case 2:
	     System.out.println("This is case 2");
	     break;

	     case 3:
	     System.out.println("This is case 3");
	     break;
	   }
	}
}