import java.util.Scanner;
class WithDrawTask
{
	public static void main(String args[])
	{
       Scanner x=new Scanner(System.in);

       System.out.println("Enter the amount");

       int a=x.nextInt();
       int i=1000;
       

       if(a<=2000)
       {
          System.out.println("Balance is insufficient");
       }
       if(a>=2000)
       {
          System.out.println("Balance is not sufficient");
       }
       else
       {
          System.out.println("Print Nothing");
       }
	}
}