import java.util.Scanner;
class Scientific
{
	public static void main(String args[])
	{
         Scanner x=new Scanner(System.in);
         System.out.println("please enter your choice");
         

         System.out.println("Enter the 1 number");
         int a=x.nextInt();
         System.out.println("Enter the 2 number");
         int b=x.nextInt();

         int Sum=a+b;
         int Subtract=a-b;
         int Multiply=a*b;
         int Division=a/b;


         System.out.println("Sum="+Sum);
         System.out.println("Subtract="+Subtract);
         System.out.println("Multiply="+Multiply);
         System.out.println("Division="+Division);

	}
}