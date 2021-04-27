import javax.swing.JFrame;

class Main {
  public static void main(String[]args) throws InterruptedException
  {
    JFrame frame = new JFrame();
    Art art = new Art();
    frame.setBounds(10,10,700,600);
    frame.setLocationRelativeTo(null);
    frame.setTitle("Art Work");
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(art);
    while(true)
    {
      art.repaint();
      Thread.sleep(1);
    }
  }
}