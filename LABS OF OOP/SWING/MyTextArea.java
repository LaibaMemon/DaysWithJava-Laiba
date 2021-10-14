import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyTextArea
{

	 static Container c;
	 
	public static void main(String args[])
	{
		 JFrame jf=new JFrame();
		 jf.setVisible(true);
		 jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		 jf.setBounds(100,50,700,500);


		 c=jf.getContentPane();
		 c.setLayout(null);


		 JTextArea jt=new JTextArea("MY TEXT");
		 jt.setBounds(100,50,200,200);

		 Font f=new Font("Arial",Font.BOLD,15);
		 jt.setFont(f);



		 c.add(jt);
}   }
