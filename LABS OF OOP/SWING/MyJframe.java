import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyJframe
{
	public static void main(String args[])
	{
	  JFrame jf=new JFrame();

	  jf.setVisible(true);                                        //visiblity
	  //jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        //to execute the program

	  // jf.setSize(700,300);                                      //size
	   //jf.setLocation(100,50);                                   //location

	  jf.setBounds(100,100,1000,500);                      //mixup of size and location
 
	  jf.setTitle("My JFrame");                             //title

	  ImageIcon icon=new ImageIcon();                       //Image

	  jf.setIconImage(icon.getImage());
 
	  Container c=jf.getContentPane();               //background color
	  c.setBackground(Color.RED);


	  jf.setResizable(false);
	  	}


}

