class mytest
{
	int i;
	 void mytest()
	{
	i=0;
	}
   void mytest(int i)
   {
         i=i;
   }

}
class mytest2This
{
	public static void main(String args[])
	{
		mytest t1;
		t1=new mytest();
		t1.mytest();
		t1.mytest(10);
	   }	
	}
