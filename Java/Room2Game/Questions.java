import javax.swing.JOptionPane;

public class Questions
{
  int solution = 0;
  boolean correct = false; 
 
  public void createQuestion(){
    int num1 = (int)(Math.random()*15+1);
    int num2 = (int)(Math.random()*15+1);
    int operation = (int)(Math.random()*3+1);
    String operationS = "+";
    if (operation == 1)
    {
      operationS = "+";
      solution = num1 + num2;
    }
    else if(operation == 2)
    {
      operationS = "-";
      solution = num1 - num2;
    }
    else if ( operation == 3)
    {
      operationS = "*";
      solution = num1 * num2;
    }
    
    String answer = JOptionPane.showInputDialog(null,"What is "+ num1 + operationS + num2 + "?");
    System.out.println(answer);

    if(Integer.parseInt(answer) == solution)
    {
      correct = true; 
    }
  }
  
  public int getSolution()
  {
    return solution;
  }
  public void setCorrectFalse()
  {
	  correct = false;
  }
}
