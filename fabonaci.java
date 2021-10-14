class fabonaci
{
	public static void main(String args[])
	{
	   int a=0,b=1,terms=20;
	   int z;

	   System.out.print(a+" "   +b+   " ");
       
       z=a+b;
	   for(z=a+b;z<=terms;z=a+b)
	   {
	       System.out.print(z+" ");

	       a=b;
	       b=z;
	   }
	}
}