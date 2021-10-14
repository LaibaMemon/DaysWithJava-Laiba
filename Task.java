import java.util.Scanner;
class Task
{
	public static void main(String args[])
	{
        Scanner x=new Scanner(System.in);

        System.out.println("Perform the 1 condition for deposite");
        System.out.println("Perform the 2 condition for withdraw");

        int a=x.nextInt();
        int i=1000;

        if(a<=i)
        {
           System.out.println("Enter the amount");
           a=x.nextInt();
           a=a+i;
           System.out.println("Deposite="+a);
        }

        if(a!=i)
        {
           System.out.println("Enter the amount");
           a=x.nextInt();
           a=a-i;
           System.out.println("Withdraw="+a);
        }
        else
        {
          System.out.println("Print Nothing");
        }
	}
}