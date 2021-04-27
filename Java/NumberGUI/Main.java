import javax.swing.*;

class Main {
  public static void main(String[]args)
  {
    JFrame frame = new JFrame();
    Gui gui = new Gui();
    frame.setTitle("Number Facts");
    frame.setBounds(10,10,400,400);
    frame.add(gui);
    frame.setVisible(true); 
  }
}

