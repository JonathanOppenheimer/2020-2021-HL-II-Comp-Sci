import javax.swing.JOptionPane; 

class Main {
  public static void main(String[] args) {
    Science []science = new Science[1]; 
    science[0] = new Science(true);
    JOptionPane.showMessageDialog(null, science[0]);
    science[1] = new Science();
    JOptionPane.showMessageDialog(null, science[1]);
  }
}