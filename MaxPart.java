import java.io.*;       		 //the File class
import java.net.*;     		 //the Scanner class
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.Timer;
import java.awt.image.BufferedImage;
import java.awt.Color;
public class MaxPart extends JPanel
{
   private JButton Start;
   private JButton Exit;
   private JFrame holdingFrame;
   public MaxPart(JFrame arg)
   {
<<<<<<< HEAD
      holdingFrame = arg;
      Start = new JButton("Start");
      Exit = new JButton("Exit");
      add(Start);
      add(Exit);
=======
   setLayout(new BorderLayout());
   
   ImageIcon icon = new ImageIcon("Play Button.png");
   ImageIcon icon2 = new ImageIcon("putin.png");
      Start = new JButton(icon);
      Exit = new JButton(icon2);
      add(Start, BorderLayout.WEST);
      add(Exit, BorderLayout.EAST);
>>>>>>> be11136e7fc4224ef61636e7c838c082dfdda008
      Start.addActionListener(new ListenerStart());
      Exit.addActionListener(new ListenerExit());
   }
   private class ListenerStart implements ActionListener 
   {
      public void actionPerformed(ActionEvent e)
      {
         Start.setVisible(false);
         
         // kazuyapic = new JButton(icon);
      //          kazuyapic.addActionListener(new ListenerKazuyapic());
      //          add(kazuyapic);
         
      }
   }
   private class ListenerExit implements ActionListener 
   {
      public void actionPerformed(ActionEvent e)
      {
         Exit.setVisible(false);
         System.exit(0);
      }
   }

}
