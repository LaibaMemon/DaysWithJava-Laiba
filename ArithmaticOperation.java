import java.util.Scanner;
 
class ArithmaticOperation
{
	public static void main(String args[])
	{
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the first number");
	System.out.println("Enter the second number");

	int i=x.nextInt();
	int j=x.nextInt();
    int c=i+j;
    int d=i-j;
    int e=i*j;
    int f=i%j;
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);



	}
}