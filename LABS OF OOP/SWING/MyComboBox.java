import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyComboBox
{
	public static void main(String args[])
	{
		 JFrame jf=new JFrame();
		 jf.setVisible(true);
		 jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		 jf.setBounds(100,50,700,500);


		 Container c=jf.getContentPane();
		 c.setLayout(null);


         String []arr={"A","B","C","D"};
		 JComboBox cb=new JComboBox(arr);
		 cb.setBounds(100,50,100,40);

		 cb.setEditable(true);
		 cb.setSelectedIndex(1);

		 //cb.setSelectedItem("C");

		 Font f=new Font("Arial",Font.BOLD,15);

		 cb.setFont(f);

		 c.add(cb);
		 c.revalidate();

}	}	 