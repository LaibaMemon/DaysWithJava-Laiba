interface Bank
{
	public float Interest();
}
class Hbl implements Bank
{
	public float Interest()
	{
	    return(2.2f);
	}
}
class MCB implements Bank
{
	 public float Interest()
	 {
	  return(2.2f);
	 }

}

class Main
{
	public static void main(String args[])
	{
	   Bank b=new MCB();
	   b.Interest();
	}
}