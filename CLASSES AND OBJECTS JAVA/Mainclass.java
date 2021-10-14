class Finaltest
{
	private final double PI=3.14;

	private int outerx;
    public void show()
    {
      System.out.println(PI);
    }
 class Innerclass
 {
    int innerx;
    Innerclass()
    {
       innerx=10;
       outerx=20;

    }
    void display()
    {
       System.out.println(outerx+" "+innerx);

        show();
    }
 }   

}
class Mainclass
{
	public static void main(String args[])
	{
	    Finaltest f=new Finaltest();
	    Finaltest.Innerclass i;

	    i=f.new Innerclass();
	    i.display();
	}
}