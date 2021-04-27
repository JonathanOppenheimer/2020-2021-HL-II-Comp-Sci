import javax.swing.JFrame;
import javax.swing.JLabel;

class Main {
  /**
  *

  Created by: Mateo Aguilar, Ian Fry, Samuel Klemic, 
  Jonathan Oppenheimer, Rohan Suri, Cole Tarter

  NOTE TO MR SNYDER -- THIS PROGRAM WORKS, BUT NOT 
  IN REPL -- PLEASE COPY AND PASTE THE FILES INTO 
  ECLIPSE SO THE JOPTIONPANE BOXES WORK -- WE DON'T 
  KNOW WHY THEY DON'T WITHIN REPL
  
  Client: 2nd Grade teacher at elementary school
  
  Target audience: Students learning + and - 
  
  Description: This innovative game has you play as a 
  box, navigating around the bounds of the game, in 
  search of a candy -- upon 'eating' the candy, the 
  player is confronted wtih a math problem -- upon 
  answering correctly the student gains 1 point. 
  Within the classroom enviroment, whichever student 
  recieves the most points in a time period set by the 
  teacher, 'wins.' 
  
  *
  **/
  public static void main(String[]args) throws InterruptedException
  {
    JFrame frame = new JFrame();
    Game game = new Game();
    frame.setBounds(10,10,600,600);
    frame.setLocationRelativeTo(null);
    frame.setTitle("Math Game");
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(game);
 
    while(true)
    {
      game.repaint();
      Thread.sleep(75);
    }
  }
}public class Main {
    
}
