import java.util.Scanner;

class Bill1
{
	public static void main(String args[])
	{
	    int price;
	    Scanner x=new Scanner(System.in);
	    System.out.println("Enter the total numbers of units");
	    int i=x.nextInt();
	    if(i<=50)
	    {
	    System.out.println("the total bill is "+i*10+" rupees");
	    }
	    else if(i>50 && i<=100)
	    {
	    price=i-50;
	    System.out.println((price*15+50*10)+"rupees" );
	    }
	    else if(i>100 &&  i<+200)
	    {
	    price=i-100;
	    System.out.println((price*20+50*15+50*10)+" rupees");
	    }
	    else if(i>200 && i<=300)
	    {
	    price=i-200;
	    System.out.println((price*25+100*20+50*15+50*10)+" rupees");
	    }
	    if(i>300)
	    {
	    price=i-300;
	    System.out.println((price*30+200*25+100*20+50*15+50*10)+" rupees");
	    }
	}
}