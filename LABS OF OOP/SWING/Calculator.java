import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Calculator
{
	static JLabel num1=new JLabel("Number 1");
	static JLabel num2=new JLabel("Number 2");

	static JTextField num1_tf=new JTextField();
	static JTextField num2_tf=new JTextField();

	static JButton add=new JButton("ADD");
	static JButton subtarct=new JButton("SUBTRACT");
	static JButton multiply=new JButton("MULTIPLY");
	static JButton divide=new JButton("DIVIDE");

	static JLabel ans=new JLabel("Answer");
	static JTextField ans_tf=new JTextField();

	static JLabel msg=new JLabel("Msg");

	public static void main(String args[])
	{

		JFrame jf=new JFrame("CALCULATOR");
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setBounds(200,100,500,500);

		Container c=jf.getContentPane();
		c.setLayout(null);


		num1.setBounds(50,50,70,25);
		num2.setBounds(50,90,70,25);

		num1_tf.setBounds(130,50,100,25);
		num2_tf.setBounds(130,90,100,25);

		//add.setBounds(20,130,70,30);
		//subtarct.setBounds(100,130,70,30);
		//multiply.setBounds(180,130,70,30);
		//divide.setBounds(260,130,70,30);

		add.setBounds(20,130,80,30);
		subtarct.setBounds(110,130,80,30);
		multiply.setBounds(200,130,80,30);
		divide.setBounds(290,130,80,30);


        ans.setBounds(50,180,200,25);
        ans_tf.setBounds(130,180,100,25);

        msg.setBounds(50,215,300,25);



        add.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
           	  add_action(e);
           }
        });


         subtarct.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
           	  subtract_action(e);
           }
        });
         
          multiply.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
           	  multiply_action(e);
           }
        });

           divide.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
           	  divide_action(e);
           }
        });
		c.add(num1);
		c.add(num2);
		c.add(num1_tf);
		c.add(num2_tf);
		c.add(add);
		c.add(subtarct);
		c.add(multiply);
		c.add(divide);
		c.add(ans);
		c.add(ans_tf);
		c.add(msg);
	}


	public static void add_action(ActionEvent e )
	{
		String s1=num1_tf.getText();
		String s2=num2_tf.getText();

		float n1=0;
		float n2=0;
        try
        {
		 n1=Float.parseFloat(s1);
		 n2=Float.parseFloat(s2);
	    }
	    catch(Exception ex)
	    {
	    	msg.setText("Please enter a valid Number");
	    }

		float an=n1+n2;
		String ans_str=Float.toString(an);
		ans_tf.setText(ans_str);
	}

	public static void subtract_action(ActionEvent e )
	{
		String s1=num1_tf.getText();
		String s2=num2_tf.getText();

		float n1=0;
		float n2=0;
        try
        {
		 n1=Float.parseFloat(s1);
		 n2=Float.parseFloat(s2);
	    }
	    catch(Exception ex)
	    {
	    	msg.setText("Please enter a valid Number");
	    }

		float an=n1-n2;
		String ans_str=Float.toString(an);
		ans_tf.setText(ans_str);
	}

	public static void multiply_action(ActionEvent e )
	{
		String s1=num1_tf.getText();
		String s2=num2_tf.getText();

		float n1=0;
		float n2=0;
        try
        {
		 n1=Float.parseFloat(s1);
		 n2=Float.parseFloat(s2);
	    }
	    catch(Exception ex)
	    {
	    	msg.setText("Please enter a valid Number");
	    }

		float an=n1*n2;
		String ans_str=Float.toString(an);
		ans_tf.setText(ans_str);
	}

	public static void divide_action(ActionEvent e )
	{
		String s1=num1_tf.getText();
		String s2=num2_tf.getText();

		float n1=0;
		float n2=0;
        try
        {
		 n1=Float.parseFloat(s1);
		 n2=Float.parseFloat(s2);
	    }
	    catch(Exception ex)
	    {
	    	msg.setText("Please enter a valid Number");
	    }

		float an=n1/n2;
		String ans_str=Float.toString(an);
		ans_tf.setText(ans_str);
	}
}