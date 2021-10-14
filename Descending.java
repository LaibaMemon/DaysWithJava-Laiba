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


class factorial
{
	public static void main(String args[])
	{
		 int fact=1;
		 for(int i=4;i>0;i--)
		 {
		 	fact*=i;
		 }
		 System.out.print("fact"+fact);
	}
}

class table
{
	public static void main(String args[])
	{
		 for(int x=2;x<=10;x++)
		 
          { System.out.println("table"+x);
		 	 for(int y=1;y<=10;y++)
		 	 {
		 	 	System.out.println(x+"X"+y+"="+x*y);
		 	 }
		} 
	}
}


class order
{
	int arr[]=new int[4];
	public void Ascending()
	{
		 arr[0]=1;
		 arr[1]=7;
		 arr[2]=8;
		 arr[3]=2;

		for(int i=0;i<=3;i++)
		{
			for (int j=0;j<3;j++)
			{

				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=3;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
class ascending
{
	public static void main(String args[])
	{
		order a=new order();
		a.Ascending();
	}
}

class oye
{
	int arr[]=new int[4];
	public void Descending()
	{
		 arr[0]=1;
		 arr[1]=7;
		 arr[2]=8;
		 arr[3]=2;

		for(int i=0;i<=3;i++)
		{
			for (int j=0;j<3;j++)
			{

				if(arr[j]>arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		for(int i=3;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
class descending
{
	public static void main(String args[])
	{
		oye a=new oye();
		a.Descending();
	}
}
