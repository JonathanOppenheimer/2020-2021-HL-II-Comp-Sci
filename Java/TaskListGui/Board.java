import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;


public class Board extends JPanel implements ActionListener{
Scanner kb = new Scanner(System.in);
JTextField answer;
JTextArea taskarea;
JLabel [] tasks;
int amt;
ArrayList <Calendar> todoList = new ArrayList <Calendar>();

  public Board(){
    setToDos();
    setLayout(new BorderLayout());
    JPanel northpanel = new JPanel();
      JLabel spaces = new JLabel("How many tasks do you have?");
      answer = new JTextField(5);
      northpanel.add(spaces);
      northpanel.add(answer);
    add(northpanel,BorderLayout.NORTH);
    
    JPanel centralpanel = new JPanel();
    JLabel title = new JLabel("Here's What You Have To Do:");
    centralpanel.setLayout(new GridLayout(8,1));
      JButton ENTERButton = new JButton("ENTER");
      ENTERButton.addActionListener(this);
      centralpanel.add(ENTERButton);
      centralpanel.add(title);
      tasks = new JLabel[10];
        for(int i=0; i<10;i++)
        {
          tasks[i]=new JLabel("");
          centralpanel.add(tasks[i]);
        }
    add(centralpanel,BorderLayout.CENTER);
  }

  public void actionPerformed (ActionEvent e){
    String act = e.getActionCommand();
    if(act.equalsIgnoreCase("ENTER")){
      String ans = answer.getText();
      amt = Integer.parseInt(ans);
      setToDos();
      for(int i = 0; i<todoList.size(); i++){
        //tasks[i] = new JLabel(todoList.get(i)+ "  ");
        tasks[i].setText(todoList.get(i)+" ");
      }
    }
  }
  public void setToDos(){
  String work = "";
  int day = 0;
  int month = 0;
    for(int i = 0;i<amt;i++){
      work = JOptionPane.showInputDialog("What is the task?");
      day = Integer.parseInt(JOptionPane.showInputDialog("What day do you want this complete?(Number)"));
      month = Integer.parseInt(JOptionPane.showInputDialog("What month do you want this complete?(Number)"));
      todoList.add(new Calendar(work,day,month));
    }
  }
}