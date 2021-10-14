import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyPanel
{
	public static void main(String args[])
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setBounds(100,100,500,300);
		jf.setTitle("My Panel");

		Container c=jf.getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(null);


		JPanel p=new JPanel();
		p.setBackground(Color.ORANGE);
		p.setBounds(0,0,250,300);

		c.add(p);




	}
}