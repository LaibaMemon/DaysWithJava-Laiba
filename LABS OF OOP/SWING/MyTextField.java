import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyTextField
{
	public static void main(String args[])
	{
		 JFrame jf=new JFrame();

	     jf.setVisible(true);                                        //visiblity
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.setBounds(100,100,1000,500);

	     Container c=jf.getContentPane();
	     jf.setLayout(null);

	     JTextField t=new JTextField();
	     t.setBounds(100,50,200,40);
        

         Font f=new Font("Arial",Font.BOLD,25);
         t.setFont(f);

         Color cl=new Color(120,100,20);
         t.setBackground(cl);                 //to set our choice color

        // t.setBackground(Color.YELLOW);    //pre defined colors
         t.setForeground(Color.RED);

	     c.add(t); 
	}
}