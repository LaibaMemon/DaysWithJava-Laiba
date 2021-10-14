import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutTest extends JFrame
{
   private JButton leftBut, centerBut, rightBut;
   private Container c;
   private FlowLayout layout;
   
   public FlowLayoutTest()
   {
      super ("Flow Layout");
      layout = new FlowLayout(FlowLayout.RIGHT); // Make a new FlowLayout object
      c = getContentPane();      // Easy way to get space within the JFrame that won't overlap the title bar   
      c.setLayout(layout);       // Set the container's layout
   
      leftBut = new JButton ("Left");
      centerBut = new JButton ("Center");
      rightBut = new JButton ("Right");
   
      c.add(leftBut);   // Add the three buttons in left to right order...
      c.add(centerBut);
      c.add(rightBut);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main (String args[])
   {
     FlowLayoutTest app = new FlowLayoutTest();
   
     //app.addWindowListener( new WindowAdapter(){ public void windowClosing(WindowEvent e) { System.exit(0); } } );
     //app.setSize (300,75);
     app.pack();
     app.setVisible(true);
   }
}