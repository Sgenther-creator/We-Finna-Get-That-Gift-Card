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
   public MaxPart()
   {
<<<<<<< HEAD
      holdingFrame = arg;
      Start = new JButton("Start");
      Exit = new JButton("Exit");
      add(Start);
      add(Exit);
      setLayout(new BorderLayout());
      ImageIcon icon = new ImageIcon("Play Button.png");
      ImageIcon icon2 = new ImageIcon("putin.png");
      Start = new JButton(icon);
      Exit = new JButton(icon2);
      add(Start, BorderLayout.WEST);
      add(Exit, BorderLayout.EAST);
      setLayout(new BorderLayout());
      ImageIcon icon = new ImageIcon("Play Button.png");
      ImageIcon icon2 = new ImageIcon("putin.png");
      ImageIcon icon3 = new ImageIcon("money.jpg");
      JLabel j = new JLabel(icon3);
      Start = new JButton(icon);
      Exit = new JButton(icon2);
      JPanel panelBottom = new JPanel();
      panelBottom.setLayout(new FlowLayout());
      add(j);
      add(panelBottom, BorderLayout.SOUTH);
      Start.setBackground(Color.WHITE);
      Exit.setBackground(Color.WHITE);
      setBackground(Color.WHITE);
      panelBottom.setBackground(Color.WHITE);
      panelBottom.add(Start);
      panelBottom.add(Exit);
      Start.addActionListener(new ListenerStart());
      Exit.addActionListener(new ListenerExit());
   }
   private class ListenerStart implements ActionListener 
   {
      public void actionPerformed(ActionEvent e)
      {
         holdingFrame.setContentPane(new CharacterCreation(holdingFrame));
         
         // kazuyapic = new JButton(icon);
      //          kazuyapic.addActionListener(new ListenerKazuyapic());
      //          add(kazuyapic);
         
         Start.setVisible(false);
            
      }
   }
   private class ListenerExit implements ActionListener 
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }

}
