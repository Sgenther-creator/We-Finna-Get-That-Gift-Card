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
public class Character 
{
   public int approval;
   public int character;

   public Character(int i)
   {
      approval = 50;
      character = i;
   }
   public void decrease()
   {
      approval -= 10;
   }
   public void increase()
   {
      approval += 10;
   }

}