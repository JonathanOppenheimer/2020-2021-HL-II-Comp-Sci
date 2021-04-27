import javax.swing.*;
import java.awt.*;

class Main{
  public static void main (String[]args){
    JFrame frame = new JFrame();
    Board board = new Board();
    frame.setBounds(10,10,500,500);
    frame.setVisible(true);
    frame.add(board);
    board.setVisible(true);
  }
}