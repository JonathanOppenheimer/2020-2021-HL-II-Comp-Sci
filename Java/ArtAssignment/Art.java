import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Art extends JPanel implements KeyListener, ActionListener
{
  Ball ball = new Ball();
  Ball ball2 = new Ball();
  String word;
  //constructor method
  public Art()
  {
    setFocusable(true); 
    addKeyListener(this);
  }
  public void paint(Graphics g)
  {
    g.setColor(ball.getBallColor());
    g.fillOval(ball.getBallX(), ball.getBallY(),25,25);
    g.setColor(ball2.getBallColor());
    g.fillOval(ball2.getBallX(), ball2.getBallY(),25,25);
    g.drawString(word,50,50);
  }
  public void actionPerformed(ActionEvent e)
  {
    
  }
  public void keyPressed(KeyEvent e)
  {
   /* System.out.println(e.getKey()); 
    char character = (char)(e.getKeyCode());
    System.out.println(character); */ 
    word = word + (char)e.getKeyCode();
    if(e.getKeyCode() == VK)
    {

    }
  }
  public void keyReleased(KeyEvent e)
  {

  }
  public void keyTyped(KeyEvent e)
  {

  }
}