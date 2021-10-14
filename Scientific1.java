import java.util.Scanner;
class Scientific1
{
	public static void main(String args[])
	{
     Scanner x=new Scanner(System.in);

    System.out.println("Enter ur choice");
     
     System.out.println("Press 1 for add");
     System.out.println("Press 2 for subtract");
     System.out.println("Press 3 for multiply");

     int a=x.nextInt();


     System.out.println("Enter the 1 no");
     int b=x.nextInt();
     System.out.println("Enter the 2 no");
     int c=x.nextInt();
     int Sum=b+c;
     System.out.println("sum="+Sum);

     System.out.println("Enter the 1 no");
     int d=x.nextInt();
     System.out.println("Enter the 2 no");
     int e=x.nextInt();
     int Subtract=d-e;
     System.out.println("subtract="+Subtract);


     System.out.println("Enter the 1 no");
     int f=x.nextInt();
     System.out.println("Enter the 2 no");
     int g=x.nextInt();
     int Multiply=f*g;
     System.out.println("Multiply="+Multiply);




     

	}

}