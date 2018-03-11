import java.io.*;       		 //the File class
import java.net.*;     		 //the Scanner class
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.awt.*;
import edu.fcps.Turtle;
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

   public MaxPart()
   {
      Start = new JButton("Start");
      Exit = new JButton("Exit");
      add(Start);
      add(Exit);
      Start.addActionListener(new ListenerStart());
      Exit.addActionListener(new ListenerExit());
   }
   private class ListenerStart implements ActionListener 
   {
      public void actionPerformed(ActionEvent e)
      {
         Start.setVisible(false);
         //ImageIcon icon = new ImageIcon("Kazuya Fish.png");
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
