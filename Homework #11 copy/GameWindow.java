// Brian Boisjoli
// CS 110
// Final Homework: Game Interface Window

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GameWindow extends JFrame
{
   public GameWindow()
   {
      // Set the background color
      getContentPane().setBackground(Color.BLUE);
      
      // Set the title name
      setTitle("War");
      
      // Set the window size
      setLayout(new BorderLayout(200,100));
      
      //Set the exit button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create all the panels
      JPanel north = new JPanel();
      JPanel south = new JPanel();
      JPanel east = new JPanel();
      JPanel west = new JPanel();
      JPanel center = new JPanel();
      
      // Create the title and set font, color, and size
      JLabel title = new JLabel("War");
      title.setFont(new Font("SansSerif", Font.BOLD, 60));
      title.setForeground(Color.white);
      
      // Set the header/footer/center color
      north.setBackground(Color.black);
      south.setBackground(Color.black);
      center.setBackground(Color.black);
      
      // Create the flip button
      JButton flip = new JButton("Flip");
      
      // Create the war button and background
      JButton war = new JButton("War");
      war.setBackground(Color.blue);
      
      // Display player 1's points
      JLabel points1 = new JLabel("Player One's Points: ");
      points1.setFont(new Font("SansSerif", Font.BOLD, 20));  
      
      // Display player 2's points
      JLabel points2 = new JLabel("Player Two's Points: ");
      points2.setFont(new Font("SansSerif", Font.BOLD, 20));
      
      // Set the color of the players scores
      points1.setForeground(Color.white);
      points2.setForeground(Color.white);
      
      // Button for the exit and display winner
      JButton close = new JButton("End Game");
      ImageIcon backW = new ImageIcon("back.jpg");
      JLabel backWest = new JLabel(backW);
      
      // Image for player 2 deck in East
      ImageIcon backE = new ImageIcon("back.jpg");
      JLabel backEast = new JLabel(backE);
      
      // Create the south panel
      south.add(points1);
      south.add(close);
      south.add(points2);
      
      // Create the north panel 
      north.add(title);
      
      // Create the west panel
      west.add(backWest);
      
      // Create the east panel
      east.add(backEast);
      
      // Create the center panel
      center.add(flip);
      center.add(war);
      
      // Add all panels to the interface
      add(north, BorderLayout.NORTH);
      add(south, BorderLayout.SOUTH);
      add(center, BorderLayout.CENTER);
      add(west, BorderLayout.WEST);
      add(east, BorderLayout.EAST);
      
      // Pack the window
      pack();
      
      // Make visible
      setVisible(true);
      
      // Make sure close button closes
      close.addActionListener(new CloseListener());
      
      // To use the flip button
      flip.addActionListener(new FlipListener());
            
   }
   
   private class FlipListener implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         // Create JLabels
         JPanel center = new JPanel();
         JPanel north = new JPanel();

         add(center, BorderLayout.CENTER);
         add(north, BorderLayout.NORTH);
         
         // Create an instance of the Card class
         Deck deck = new Deck();
         
         // Shuffle the deck
         deck.shuffle();
         
         // Display each player's points
         JLabel card1 = new JLabel(deck.dealCard().toString());
         card1.setFont(new Font("SansSerif", Font.BOLD, 10));
         card1.setForeground(Color.white);
         
         // Add card image
         north.add(card1);
      }
   }
        
   private class CloseListener implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         //Display winner
         JOptionPane.showMessageDialog(null, "The winner is: ");
        
         //north.setBackground
         System.exit(0);
      }
   }           
}