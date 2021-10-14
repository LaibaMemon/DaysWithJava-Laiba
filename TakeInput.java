import java.util.Scanner;
class TakeInput
{
	public static void main(String args[])
{
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the name and roll no");
	String s =x.next();
	int i=x.nextInt();
	System.out.println(s+""+i);
}
}
