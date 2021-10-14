class Operator
{
	public static void main(String args[])
	{
	    int a=5;
	    int b=2;
	    int c=4;
	    int d=6;


       //LOGICAL OPERATOR OR AND AND NOT
	    boolean result=!(a>b);      //false
        System.out.println("Not="+result);

        boolean answer=(a>b)&&(c>d);  //false
        System.out.println("And="+answer);

        boolean ans=(a>b)||(c>d);
        System.out.println("OR="+ans);   //true
	}
}