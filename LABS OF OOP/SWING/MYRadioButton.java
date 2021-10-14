import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MYRadioButton
{
	public static void main(String args[])
	{
		 JFrame jf=new JFrame();
		 jf.setVisible(true);
		 jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		 jf.setBounds(100,50,700,500);


		 Container c=jf.getContentPane();
		 c.setLayout(null);

		 JRadioButton r=new JRadioButton("Male");
		 r.setBounds(100,50,100,30);

		 JRadioButton r1=new JRadioButton("Female");
		 r1.setBounds(200,50,200,30);

		 ButtonGroup gender=new ButtonGroup();
		 gender.add(r);
		 gender.add(r1);

		 Font f=new Font("Arial",Font.BOLD,25);
		 r.setFont(f);
		 r1.setFont(f);

		// r.setSelected(true);
		 r.setEnabled(false);



		 JRadioButton gen=new JRadioButton("Date");
		 gen.setBounds(100,100,100,30);

		 JRadioButton ob=new JRadioButton("Birth");
		 ob.setBounds(200,100,100,30);


		 ButtonGroup cat=new ButtonGroup();
		 cat.add(gen);
		 cat.add(ob);

		 gen.setFont(f);
		 ob.setFont(f);


		 //ob.setSelected(true);
		 ob.setEnabled(true);
		 gen.setEnabled(false);

		 c.add(r);
		 c.add(r1);
		 c.add(gen);
		 c.add(ob);

	}
}