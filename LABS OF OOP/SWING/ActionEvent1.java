import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends JFrame implements ActionListener
{
	Container c;
	JTextField tf=new JTextField();
	MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		tf.setBounds(50,50,100,40);
		

		Font f=new Font("Arial",Font.BOLD,25);
		tf.setFont(f);
		c.add(tf);
		tf.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e)
	{
        String text=tf.getText();
        String newText=text.toUpperCase();
        tf.setText(newText);
	}
}

class ActionEvent1
{
	public static void main(String args[])
	{
		MyFrame mf=new MyFrame();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setBounds(200,200,500,400);
	}
}