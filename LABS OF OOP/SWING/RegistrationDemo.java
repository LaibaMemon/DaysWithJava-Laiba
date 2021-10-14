import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegistrationDemo

{
	public static void main(String args[])
	{
		 JFrame jf=new JFrame("My Registration");
		 jf.setVisible(true);
		 jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		 jf.setBounds(100,100,740,500);


		 Container c=jf.getContentPane();           //we add the frame in our Container pane
 		 c.setLayout(null);
 		 c.setBackground(Color.YELLOW);            //for set the Background color

		 JLabel name_label=new JLabel("Name");
		 name_label.setBounds(50,50,60,30);

		 JTextField name_tf=new JTextField();
		 name_tf.setBounds(150,50,150,25);

		 JLabel mob_label=new JLabel("Mobile");
		 mob_label.setBounds(50,100,60,30);

		 JTextField mob_tf=new JTextField();
		 mob_tf.setBounds(150,100,150,25);
        
         JLabel dob_label=new JLabel("Date Of Birth");
		 dob_label.setBounds(50,150,90,30);

         String[] day_arr=new String[31];
         for(int i=1;i<=31;i++)
         	day_arr[i-1]=Integer.toString(i);
		 JComboBox day=new JComboBox(day_arr);          //its use for selecetd choices
		 day.setBounds(150,150,50,25);

         String[] month_arr={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		 JComboBox month=new JComboBox(month_arr);
		 month.setBounds(220,150,70,25);

         String[] year_arr=new String[70];
         for(int i=1951;i<=2020;i++ )
         	year_arr[i-1951]=Integer.toString(i);
		 JComboBox year=new JComboBox(year_arr);
		 year.setBounds(310,150,60,25);


		 JLabel gen_label=new JLabel("Gender");
		 gen_label.setBounds(50,200,60,30);

		 JRadioButton male=new JRadioButton("Male");
		 male.setBounds(150,200,80,30);

		 JRadioButton female=new JRadioButton("Female");          //in the radiobutton we have to tick on both choices
		 female.setBounds(240,200,80,30);

		 ButtonGroup gender=new ButtonGroup();                     //to select any one choice
		 gender.add(male);  
		 gender.add(female);

         JLabel add_label=new JLabel("Address");
		 add_label.setBounds(50,250,60,30);
		 
         JTextArea add_ta=new JTextArea();                      //In  the textArea we have to write multiple Statemnts.
         add_ta.setBounds(150,250,230,50);


         JCheckBox tandc=new JCheckBox("I Accept All The Terms And Conditions");     
         tandc.setBounds(50,320,250,25);
        

         JButton submit=new JButton("Submit");
         submit.setBounds(100,355,80,40);

         JTextArea output=new JTextArea();
         output.setBounds(400,50,300,350);
		 






		 c.add(name_label);
		 c.add(name_tf);
		 c.add(mob_label);
		 c.add(mob_tf);
		 c.add(dob_label);
		 c.add(day);
		 c.add(month);
		 c.add(year);
		 c.add(gen_label);
		 c.add(male);
		 c.add(female);
		 c.add(add_label);
		 c.add(add_ta);
		 c.add(tandc);
		 c.add(submit);
		 c.add(output);

}


}

    