import javax.swing.JOptionPane; 

class Main {
  public static void main(String[] args) 
  {
    History []history = new History[1]; 
    history[0] = new History(true);
    JOptionPane.showMessageDialog(null, history[0]);
    history[1] = new History();
    JOptionPane.showMessageDialog(null, history[1]);
  }
}