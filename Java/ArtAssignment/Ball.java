import java.awt.*;

public class Ball
{
  private int ballX;
  private int ballY;
  private int ballXspeed;
  private int ballYspeed;
  private Color randomColor; 
  public Ball()
  {
    ballX = (int)(Math.random()*300+100);
    ballY = (int)(Math.random()*300+100);
    ballXspeed = 1;
    ballYspeed = 1;
  }
  private void setBallX()
  {
    if(ballX == 700 || ballX == 0)
    {
      ballXspeed = -1 * ballXspeed; 
      setBallColor(); 
    }
    ballX = ballX + ballXspeed;
  }
  public int getBallX()
  {
    setBallX();
    return ballX; 
  }

  private void setBallY()
  {
    if(ballY == 600 || ballY == 0)
    {
      ballYspeed = -1 * ballYspeed; 
      setBallColor(); 
    }
    ballY = ballY + ballYspeed;
  }
  public int getBallY()
  {
    setBallY();
    return ballY; 
  }
  private void setBallColor()
  {
    int R = (int) (Math.random()*256);
    int G = (int)(Math.random()*256);
    int B = (int)(Math.random()*256);
    randomColor = new Color(R, G, B); 
  }
  public Color getBallColor()
  {
    return randomColor; 
  }
}
