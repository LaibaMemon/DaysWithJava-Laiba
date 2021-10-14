import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJButton
{
	public static void main(String args[])
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setBounds(100,100,1000,500);

		Container c=jf.getContentPane();
		jf.setLayout(null);


		//JButton jb=new JButton("Click Me");    //if u want to change this click me to something else
		
		//jb.setText("Another");

		//ImageIcon i=new ImageIcon();
		//JButton jb=new JButton(i);    //to set the image wu pass through this object
		//jb.setBounds(100,50,100,40);

		JButton jb=new JButton("Click");
		jb.setSize(100,50);
		jb.setLocation(100,20);

		Font f=new Font("Arial",Font.BOLD,25);
		jb.setFont(f);

		jb.setBackground(Color.PINK);
		jb.setForeground(Color.GREEN);

		Cursor s=new Cursor(Cursor.WAIT_CURSOR);
		jb.setCursor(s);


		c.add(jb);


	}
}