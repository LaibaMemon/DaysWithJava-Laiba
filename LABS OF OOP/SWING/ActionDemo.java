import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame
{
	JButton jb =new JButton("Click");

	Container c;

	MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		jb.setBounds(100,50,100,50);

       c.add(jb);
	}
}

class ActionDemo
{
	public static void main(String args[])
	{
		MyFrame f=new MyFrame();
		f.setTitle("Action Demo");
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

		f.setBounds(100,50,700,500);

	}
}