import java.util.Scanner;
class tableforloop
{
	public static void main(String args[])
	{
	    Scanner x=new Scanner(System.in);

	    System.out.println("Enter the number=");
	    int a=x.nextInt();


	    for(int i=1;i<=10;i++)
	    {
	        System.out.println(a+ "*" +i+ "="+(a*i));
	    }
	}
}