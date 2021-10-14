import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ActionDemo3
{ 
	static Container c;
	public static void main(String args[])
	{
     
     JFrame jf=new JFrame("My class ");
     jf.setVisible(true);
     jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
     jf.setBounds(200,100,700,500);

     c=jf.getContentPane();
     c.setLayout(null);


     JButton red=new JButton("RED");
     red.setBounds(100,50,100,40);

     RedListenerClass redListener=new RedListenerClass();
     red.addActionListener(redListener);

     c.add(red);



	}
}
class RedListenerClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		ActionDemo3.c.setBackground(Color.RED);
	}
}