class PrintIndex
{ 
public static void main(String args[])
{
 String[] arr={"abc","def","ghi"};
 for(int i=arr.length-1;i>=0;i--)
{ 
  System.out.println(i+" "+arr[i]);
}
}
}