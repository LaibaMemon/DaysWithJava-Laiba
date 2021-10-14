import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyCheckBox
{
	public static void main(String args[])
	{
		 JFrame jf=new JFrame();
		 jf.setVisible(true);
		 jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		 jf.setBounds(100,50,700,500);


		 Container c=jf.getContentPane();
		 c.setLayout(null);


		 JCheckBox jc=new JCheckBox("Core Java");
         jc.setBounds(100,50,300,40);

         Font f=new Font("Arial",Font.BOLD,25);
         jc.setFont(f);

         //jc.setSelected(true);
         jc.setEnabled(false);

         c.add(jc);


}   }