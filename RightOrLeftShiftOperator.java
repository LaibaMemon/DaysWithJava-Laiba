class RightOrLeftShiftOperator
{
public static void main(String args[])
{
   int a=12;             //00001100       c)//RIGHT SHIFT
   int b=a>>4;           //00000000=0


   int c=a<<4;           //00001100       //LEFT SHIFT
                         //11000000=12


  System.out.println("RIght:" +b);
  System.out.println("LEFT:"  +c);
}
}