class PracticeBitwiseOperator
{
public static void main(String args[])
{
   int a=8;
   int b=9;
   int c=a&b;       //And Operator   =8
 
   int d=a|b;        //Or Operator    =9

   int e=a^b;        //Ex or Operator  =1

   int f= ~a;       //Not Operator    =-9
  
   System.out.println("AND OPERATOR RESULT:"+c);
   System.out.println("OR OPERATOR RESULT:"+d);
   System.out.println("EX OR OPERATOR RESULT:"+e);
   System.out.println("NOT OPERATOR RESULT:"+f);
}
}
