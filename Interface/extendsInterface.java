interface laiba
{
	public void ok();
}
interface nabiha extends laiba
{
	public void ok();
}
class main implements nabiha
{
	 public void ok()
	 {
	     System.out.println("OKKKK");
	 }
}

class extendsInterface
{
	public static void main(String args[])
	{
	   nabiha n= new main();
	   n.ok();
	}
}