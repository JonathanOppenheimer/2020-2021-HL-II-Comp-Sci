import java.awt.*;

public class Apples {
  public int ballX;
  public int ballY;

  public Apples()
  {
    ballX = (int)(Math.random()*20)*29;
    ballY = (int)(Math.random()*20)*29;
  }
  public void setBallPos(){
    ballX =(int)(Math.random()*20)*29;

    ballY = (int)(Math.random()*20)*29;
  }
  public int getBallX(){
    return ballX;
  }
  public int getBallY() {
    
    return ballY;
  }
}

public class Apples {
    
}
