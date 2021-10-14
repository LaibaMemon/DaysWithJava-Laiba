interface Bank
{
	public void Interest();
}

class HBL implements Bank
{
	 public void Interest()
	 {
          System.out.println("Laiba");
  	 }
}

class Interface3
{
	public static void main(String args[])
	{
	  Bank b=new HBL();
	  b.Interest();
	}
}