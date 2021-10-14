import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ItemListener
{
	Container c;
	JComboBox jc;
	MyFrame()
	{
      c=this.getContentPane();
      c.setLayout(null);

      
      Color[] clr={Color.YELLOW,Color.PINK,Color.GREEN};
      jc=new JComboBox(clr);
      jc.setBounds(50,50,150,40);
      jc.addItemListener(this);

      c.add(jc);



	}
	public void itemStateChanged(ItemEvent e)
	{
       Color selectedColor=(Color)jc.getSelectedItem();
       c.setBackground(selectedColor);
	}
}
class ItemEvent1
{
	public static void main(String args[])

	{
		MyFrame mf=new MyFrame();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setBounds(200,200,500,400);
	}
}