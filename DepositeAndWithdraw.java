import java.util.Scanner;
class DepositeAndWithdraw
{
	public static void main(String args[])
	{
        Scanner x=new Scanner(System.in);

        System.out.println("Press 1 for deposite");
        System.out.println("Press 2 for withdraw");

        int a=x.nextInt();
        int i=1000;

        switch(a)
        {
           case 1:
           System.out.println("Enter the current amount to deposite");
           a=x.nextInt();
           a=a+i;
           System.out.println("The result is="+a);
           break;

           case 2:
           System.out.println("Enter the current amount to withdraw");
           a=x.nextInt();
           a=a-i;
           System.out.println("The result is="+a);
           break;
        }
      




	}
}