class outerclass
{
	int i;
    public void outerMethod(int i)
    {
        this.i=i;
        System.out.println("outerclass"+i);
    }	
    class innerclass
   {
         int j;
         public void innerMethod(int j)
         {
            this.j=j;
            System.out.println("innerclass"+j);
         }
   }
   }
 class Main
 {
    public static void main(String args[])
    {
        outerclass o=new outerclass();
        o.outerMethod(10);
        outerclass.innerclass i=o.new innerclass();
        i.innerMethod(20);
    }
 }