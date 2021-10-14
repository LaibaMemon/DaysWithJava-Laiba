class DMAS
{
	int addition(int a,int b)
	{
	     return a+b;
	} 
	int subtraction(int c,int d)
	{
         return c-d;
	}
	int multiplication(int e,int f)
	{
	     return e*f;
	}
	int division(int g,int h)
	{
	     return g/h;
	}
}

class MainDMAS
{
	public static void main(String args[])
	{
	   DMAS A1;
	   A1=new DMAS();
	   int x=A1.addition(5,5); 
       System.out.println(x);
       int y=A1.subtraction(6,6);
       System.out.println(y);
       int z=A1.multiplication(7,7);
       System.out.println(z);
       int p=A1.division(8,8);
       System.out.println(p);

	}
}