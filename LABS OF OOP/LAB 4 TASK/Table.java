import java.util.Scanner;

class Table
{
	
	public static void main(String args[])
	{
  
    Scanner x=new Scanner(System.in);
    System.out.println("Enter the number");

    int a=x.nextInt();
    System.out.println("Print upto:");

    int upto=x.nextInt();
    for(int i=5;i<=upto;i++)

    {

    System.out.println(a+ "X"+i+":"+i*a);
    } 


	}
}