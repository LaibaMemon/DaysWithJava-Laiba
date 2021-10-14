interface Area
{
    double PI=3.14;
    int radius=2;
    

    int l=2;
    int b=2;
    int w=2;
	public void result();
}
class Volume implements Area
{
	public void result()
	{
	   double area=PI*radius*radius;
	   System.out.println("Area is"+area);
	}
}
class Draw implements Area
{
	public void result()
	{
	   int volume=l*b*w;
	   System.out.println("Volume is"+volume);
	}
}

class Interface2
{
	public static void main(String args[])
	{
	   Area a=new Volume();
	   a.result();

	   Area b=new Draw();
	   b.result();
	}
}