import java.util.Scanner;
class nestedswitch
{
	public static void main(String args[])
	{
       Scanner x=new Scanner(System.in);

       System.out.println("Press 1 for Mobiles");
       System.out.println("Press 2 for FoodCourt");

       int a=x.nextInt();

       switch(a)
       {
          case 1:
          System.out.println("Press 1 for HTC");
          System.out.println("Press 2 for Nokia");
          System.out.println("Press 3 for Samsung");

          int b=x.nextInt();
          switch(b)
          {
              case 1:
              System.out.println("You purchase HTC");
              break;

              case 2:
              System.out.println("You purchase Nokia");
              break;

              case 3:
              System.out.println("You purchase Samsung");
              break;
              default:
              System.out.println("Dont have Money");



          }
          case 2:
          System.out.println("Press 4 for Burger");
          System.out.println("Press 5 for Pizza");
          System.out.println("Press 6 for Pasta");

          int c=x.nextInt();
          switch(c)
          {
             case 4:
             System.out.println("Enjoy your Burger Mam");
             break;
             case 5:
             System.out.println("Enjoy your Pizza Mam");
             break;
             case 6:
             System.out.println("Enjoy your Pasta Mam");
             break;


             default:
             System.out.println("Sorry");

          }

       }

	}
}