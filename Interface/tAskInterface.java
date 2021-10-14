interface Area
{
	 int r=2;
     double PI=3.14;

    
     int l=2;
     int b=2;
     int h=2;


     public void Result(); 
}

class volume implements Area
{
	public void Result()
	{
	   double area=PI*r*r;
	   System.out.println("Area"+area);
	}
}
class draw implements Area
{
	public void Result()
	{
	  int volume =l*b*h;
	  System.out.println("Volume"+volume);

	}
}

class tAskInterface
{
	public static void main(String args[])
	{
	    Area a=new volume();
	    a.Result();                   //area answer
	    Area b=new draw();                    //volume answer
	    b.Result();

	}
}
