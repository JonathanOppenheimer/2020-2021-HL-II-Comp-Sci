import javax.swing.JOptionPane; 
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileNotFoundException; 

public class History
{
  private String question;
  private String answer;
  private int level; 
  public History()
  {
    question = setQuestion();
    answer = setAnswer();
    level = setLevel();
    saveQuestion();
  }
  public History(boolean info)
  {
    readFromFile();
  }
  private String setQuestion()
  {
    question = JOptionPane.showInputDialog(null, "What is the science question you wish to enter?");
    return question; 
  }
  private String setAnswer()
  {
    answer = JOptionPane.showInputDialog(null, "What is the answer to " + question + "?");
    return answer; 
  }
  private int setLevel()
  {
    String levels; 
    levels = JOptionPane.showInputDialog(null, "What is the level of " + question + "?");
    level = Integer.parseInt(levels);
    return level;  
  }
  public String toString()
  {
    return "Question: " + question + "\n" + 
    "Answer: " + answer + "\n" +
    "Level: " + level; 
  }
  public void saveQuestion()
  {
    PrintWriter outputStream = null;
    try {
      outputStream = new PrintWriter(new FileOutputStream("questions.txt",true));
    } 
    catch(FileNotFoundException e) {
      System.out.println("File not found");
      System.exit(0);
    }
    outputStream.println(question);
    outputStream.println(answer);
    outputStream.println(level);
    outputStream.println("************");
    outputStream.close();
    
  }
  public void readFromFile()
  {
    Scanner InputStream = null;
    try
    {
      InputStream = new Scanner(new FileInputStream("questions.txt"));
    }
    catch(FileNotFoundException e)
    {
      JOptionPane.showMessageDialog(null, "File note found.");
    }
    question = InputStream.nextLine();
    answer = InputStream.nextLine();
    level = Integer.parseInt(InputStream.nextLine());
    InputStream.close();
  }
}