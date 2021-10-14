import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyPasswordField
{
	public static void main(String args[])
	{
		JFrame jf=new JFrame();

	     jf.setVisible(true);                                        //visiblity
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.setBounds(100,100,1000,500);

	     Container c=jf.getContentPane();
	     jf.setLayout(null);

	     JPasswordField jp=new JPasswordField();

	     jp.setBounds(100,50,100,30);

	     Font f=new Font("Arial",Font.BOLD,25);
	     jp.setFont(f);

	     jp.setBackground(Color.PINK);
	     jp.setForeground(Color.YELLOW);

	     c.add(jp);
	}
}