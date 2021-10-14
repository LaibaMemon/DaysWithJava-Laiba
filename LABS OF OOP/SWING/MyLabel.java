import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel
{
	public static void main(String args[])
	{
		 JFrame jf=new JFrame();
		 jf.setVisible(true);
		 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 jf.setBounds(100,100,1000,500);

		 Container c=jf.getContentPane();             //Jlabel
		 c.setLayout(null);


		// JLabel jl=new JLabel("UserName");  //name;
		 //jl.setText("Password");           //to change this name into password


		// c.add(jl); 
		 //jl.setBounds(100,50,200,30);           //mixup of size and location is bound

		 //Font f=new Font("Arial",Font.BOLD,30);         //font
		 //jl.setFont(f);
          
         // ImageIcon i=new ImageIcon();           //Image
		 //JLabel jl=new JLabel(i);


		 // c.add(jl);


		 ImageIcon i=new ImageIcon();
		 JLabel jl=new JLabel("Text",i,JLabel.LEFT);

		 c.add(jl);


	}
}