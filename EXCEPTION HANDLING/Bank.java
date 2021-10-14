class InsufficientFundsException extends Exception
{
	InsufficientFundsException(String s)
	{
	  super(s);
	}
}
class Bank
{
	 static void creatingaccount(int num,double balance) throws InsufficientFundsException
	 {
	  if(num==10)
	  
	 }

	 static void deposite(double amo) throws InsufficientFundsException
	 {
	   if(amo>889)
	   
	 }

	 static void draw(double amount) throws InsufficientFundsException
	 {
	   if(amount<90)
	   throw new InsufficientFundsException("LAiba");
	 }

	 public static void main(String args[])
	 {
	    creatingaccount(10,2000);
	    deposite(999);
	    draw(100);
	    System.out.println("DOne");
	 }
}

