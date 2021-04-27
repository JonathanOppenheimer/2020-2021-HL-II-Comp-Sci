import java.awt.*;

public class Snake{
  private int snakeX;
  private int snakeY;
  public static int snakeXvel;
  public static int snakeYvel;
  
  public Snake()
  {
    //Keep everything in intervals of 30
    snakeX = (int)(Math.random()*20)*30;
    snakeY = (int)(Math.random()*20)*30;
    snakeXvel = 0;
    snakeYvel = 0;
  }

  private void setSnakeX()
  {
    snakeX = snakeX + snakeXvel;
  }

  public int getSnakeX()
  {
    setSnakeX();
    return snakeX;
  }

  private void setSnakeY()
  {
    snakeY = snakeY + snakeYvel;
  }

  public int getSnakeY()
  {
    setSnakeY();
    return snakeY;
  } 
}