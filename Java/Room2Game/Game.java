import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Game extends JPanel implements KeyListener, ActionListener
{
  Snake snake = new Snake();
  Apples apples = new Apples();
  Questions questions = new Questions();
  
  public int score=0;
  Font myFont = new Font ("Courier New", 1, 40);
 
  public Game()
  {
    setFocusable(true); 
    addKeyListener(this);
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.WHITE);
    g.fillRect(0,0,600,600);
    g.setColor(Color.RED);
    g.fillOval(apples.getBallX(), apples.getBallY(), 35,35);

    g.setColor(Color.GREEN);
    g.fillRect(snake.getSnakeX(), snake.getSnakeY(), 30, 30);
    //System.out.println("snake X: "+snake.getSnakeX()+" apple Y: "+snake.getSnakeY());
    //colision
    g.setFont(myFont);
    g.drawString("Score: " + String.valueOf(score),30,40);
    if((apples.getBallX()+35)>=(snake.getSnakeX()) && (apples.getBallX())<=(snake.getSnakeX()+30)&&(apples.getBallY()+35)>=(snake.getSnakeY()) && (apples.getBallY())<=(snake.getSnakeY()+30))
    {
      apples.setBallPos();
      Snake.snakeXvel = 0;
      Snake.snakeYvel = 0;
      questions.createQuestion();
      if(questions.correct)
      {
         score++;
         questions.setCorrectFalse();
      }
     
      
    }
    if(snake.getSnakeX()>=600||snake.getSnakeX()<=0)
    {
      Snake.snakeXvel = Snake.snakeXvel*-1;
    }
    else if(snake.getSnakeY()>=560||snake.getSnakeY()<=0)
    {
      Snake.snakeYvel = Snake.snakeYvel*-1;
    }
  }
  public int getScore()
  {
    return score;
  }
  public void actionPerformed(ActionEvent e)
  {
    
  }
  public void keyPressed(KeyEvent e)
  {
    //System.out.println("X:"+Snake.snakeXvel+" Y: "+Snake.snakeYvel);

    //84: W -- 38: ^
    if(e.getKeyCode() == 87 || e.getKeyCode()==38)
    {
      Snake.snakeXvel = 0;
      Snake.snakeYvel = -5; 
    }
    //84: A -- 38: <
    else if(e.getKeyCode() == 65 || e.getKeyCode()==37)
    {
      Snake.snakeYvel = 0; 
      Snake.snakeXvel = -5; 
    }
    //84: D -- 38: >
    else if(e.getKeyCode() == 68 || e.getKeyCode()==39)
    {
      Snake.snakeYvel = 0; 
      Snake.snakeXvel = 5; 
    }
    //84: S -- 38: \/
    else if(e.getKeyCode() == 83 || e.getKeyCode()==40)
    {
      Snake.snakeXvel = 0; 
      Snake.snakeYvel = 5;  
    }
  }
  public void keyReleased(KeyEvent e)
  {

  }
  public void keyTyped(KeyEvent e)
  {

  }

}