import javax.swing.JFrame;

class Main 
{
  public static void main(String[] args) throws InterruptedException{
    JFrame frame = new JFrame();
    Graph graph = new Graph();
    frame.setBounds(10, 10, 600, 600);
    frame.setTitle("Bar Graph and Bubble Sort");
    frame.setVisible(true);
    frame.add(graph);
    while(true)
    {
      Thread.sleep(50);
      graph.repaint();
      graph.bubbleSort();
      graph.linearSort(); 
    }
  }
}