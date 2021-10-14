class Box
{
	int length;
	int width;
	int height;


	public void Volume()
	{
        System.out.println("volume is="+(length*width*height));
	}
}

class MainBox
{
	public static void main(String args[])
	{
        Box b1;
        b1=new Box();
        b1.length=10;
        b1.width=10;
        b1.height=10;

        Box b2;
        b2=new Box();
        b2.length=20;
        b2.width=20;
        b2.height=20;

        b1.Volume();
        b2.Volume();

	}
}