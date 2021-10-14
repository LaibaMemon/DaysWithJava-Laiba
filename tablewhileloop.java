import java.util.Scanner;

class tablewhileloop
{
	public static void main(String args[])
	{
	  Scanner x=new Scanner(System.in);

	  System.out.println("Enter the number=");

	  int a=x.nextInt();

	  int i=1;
	  while(i<=10);
	  {
	     System.out.println(a+"*"+i+ "="+(a*i));
	     i++;
	  }
	}
}