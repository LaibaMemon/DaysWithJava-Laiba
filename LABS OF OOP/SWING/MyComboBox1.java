import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyComboBox1
{

	 static Container c;
	 static JComboBox cb;
	 static JButton jb;
	 static JLabel jl;
	public static void main(String args[])
	{
		 JFrame jf=new JFrame();
		 jf.setVisible(true);
		 jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		 jf.setBounds(100,50,700,500);


		 c=jf.getContentPane();
		 c.setLayout(null);


         String []arr={"A","B","C","D"};
		 cb=new JComboBox(arr);
		 cb.setBounds(100,50,100,40);

		 cb.setEditable(true);
		 cb.setSelectedIndex(1);

		 //cb.setSelectedItem("C");

		 Font f=new Font("Arial",Font.BOLD,15);
		 cb.setFont(f);

		 jb=new JButton("ok");
		 jb.setBounds(250,50,100,30);


		 jb.addActionListener(new ActionListener());
		 {
		 	public void actionPerformed(ActionEvent e)
		 	{
		 		jbEvent(e);
		 	}
		 }


         jl=new JLabel("Yes");
         jl.setBounds(100,150,150,40);

		 c.add(cb);
		 c.revalidate();
		 c.add(jb);
         c.add(jl);

}	

     static void jbEvent(ActionEvent e)
     {
     	jl.setText(Integer.toString(cb.getSelectedIndex()));
     }




}
