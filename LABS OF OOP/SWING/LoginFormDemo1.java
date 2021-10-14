import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class LoginFrame extends JFrame implements ActionListener 
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

		login_bt.addActionListener(this);       //addactionlistener in login

        

        c.add(userlabel);
        c.add(passlabel);
        c.add(user_jt);
        c.add(pass_f);
        c.add(login_bt);

	}
      public void actionPerformed(ActionEvent e)
      {
      	if(e.getSource()==login_bt)
      	{
      	c.setBackground(Color.RED);           //now to match the username and password
      		//String username=user_jt.getText();
      		//String password=pass_f.getText();

      		//if(username.equals("ABC") && password.equals("123"));
      		//{
              //     c.setBackground(Color.GREEN);
      		//}

      		
        }

      
      JLabel wrn=new JLabel("Wrong usename or Password");
}
}
class LoginFormDemo1
{
	public static void main(String args[])
	{
		LoginFrame f=new LoginFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(300,50,700,500);
	}
}
