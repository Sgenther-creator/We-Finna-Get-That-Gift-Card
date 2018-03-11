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
public class Level1 extends JPanel
{
   private JButton Issue1;
   private JButton Issue2;
   private JButton Issue3;

   public Level1()
   {
      Issue1 = new JButton("Issue");
      Issue2 = new JButton("Issue2");
      Issue3 = new JButton("Issue3");
      setLayout(new BorderLayout());
      JPanel panelBottom = new JPanel();
      panelBottom.setLayout(new FlowLayout());
      add(panelBottom, BorderLayout.SOUTH);
      panelBottom.setBackground(Color.WHITE);
      Issue1.setPreferredSize(new Dimension(200, 100));
      Issue2.setPreferredSize(new Dimension(200, 100));
      Issue3.setPreferredSize(new Dimension(200, 100));
      Issue1.setFont(new Font("Arial", Font.PLAIN, 40));
      Issue2.setFont(new Font("Arial", Font.PLAIN, 40));
      Issue3.setFont(new Font("Arial", Font.PLAIN, 40));
      panelBottom.add(Issue1);
      panelBottom.add(Issue2);
      panelBottom.add(Issue3);
   
   }
}
