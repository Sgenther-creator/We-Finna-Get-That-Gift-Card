import javax.swing.JFrame;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class HackTJ2018
{
   public static void main(String[] args)
   { 
      JFrame frame = new JFrame("Phone2Action pls give us money");
      frame.setSize(800, 600);
      frame.setSize(1200, 800);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new MaxPart(frame));
      frame.setVisible(true);
   }
}