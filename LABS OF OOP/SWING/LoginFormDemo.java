import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class LoginFrame extends JFrame
{
	Container c;

	JLabel userlabel=new JLabel("Username");
	JLabel passlabel=new JLabel("Password");

	JTextField user_jt=new JTextField();

	JPasswordField pass_f=new JPasswordField();

	JButton login_bt=new JButton("LOGIN");


	LoginFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);

		userlabel.setBounds(100,50,200,40);
		passlabel.setBounds(100,150,200,40);

		Font f=new Font("Arial",Font.BOLD,25);

		userlabel.setFont(f);
		passlabel.setFont(f);

		user_jt.setBounds(250,50,150,40);
		pass_f.setBounds(250,150,150,40);

		login_bt.setBounds(150,250,200,50);

		login_bt.setFont(f);
		user_jt.setFont(f);
		pass_f.setFont(f);

        

        c.add(userlabel);
        c.add(passlabel);
        c.add(user_jt);
        c.add(pass_f);
        c.add(login_bt);

	}
}
class LoginFormDemo
{
	public static void main(String args[])
	{
		LoginFrame f=new LoginFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(300,50,700,500);
	}
}