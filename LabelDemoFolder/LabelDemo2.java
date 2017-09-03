//**********************************************************************
//     Below is the algorith for this program:
//   1.) created the frame.
//   2.) created the gui widgets.
//   3.) created the panel.
//   4.) added the widgets to the panel.
//   5.) added the panel to the frame.
//**********************************************************************
//       Assignment 2----  LabelDemo2.java
//
//    William Scott Cowell
//    C.Conner
//    CS111B
//    SECTION 001
//
//This stand alone GUI program demonstrates the use of image icons in labels.
//
//***************************************************************************

// This imports the utilities needed for the gui program.
import java.awt.*;
import javax.swing.*;

public class LabelDemo2
{
   /**
      Creates and displays the frame requested.
   */
   public static void main (String[] args)
   {
      // This creates the frame and assigns an action to the x button.
      JFrame frame = new JFrame ("Label Demo");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      // This assigns the image file to the program. 
      ImageIcon icon = new ImageIcon ("ezgif-save.gif");

      // This creates the gui variables/widgets.
      JLabel label1, label2, label3, label4;

      // This assigns first lables location and text assignment.
      label1 = new JLabel ("Apple logo Left", icon, SwingConstants.CENTER);

      // This assigns second lables location and text assignment.
      label2 = new JLabel ("Apple logo Right", icon, SwingConstants.CENTER);
      label2.setHorizontalTextPosition (SwingConstants.LEFT);
      label2.setVerticalTextPosition (SwingConstants.BOTTOM);

      // This assigns third lables location and text assignment.
      label3 = new JLabel ("Apple logo Above", icon, SwingConstants.CENTER);
      label3.setHorizontalTextPosition (SwingConstants.CENTER);
      label3.setVerticalTextPosition (SwingConstants.BOTTOM);

      // This assigns fourth lables location and text assignment.
      label4 = new JLabel ("Apple logo Below", icon, SwingConstants.CENTER);
      label4.setHorizontalTextPosition (SwingConstants.CENTER);
      label4.setVerticalTextPosition (SwingConstants.TOP);
      
      // This creates the panel and then assigns the variables/widgets
      // to that panel.
      JPanel panel = new JPanel();
      panel.setBackground (Color.blue);
      panel.setPreferredSize (new Dimension (600, 600));
      panel.add (label1);
      panel.add (label2);
      panel.add (label3);
      panel.add (label4);

      // Adds the panel to the frame.
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}
