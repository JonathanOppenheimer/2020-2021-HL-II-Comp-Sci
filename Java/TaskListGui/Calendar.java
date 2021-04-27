import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Calendar
{
//global class variables 
private String task;
private int month;
private int day;
Scanner kb = new Scanner(System.in);

public Calendar(String task, int month, int day){
this.task = task;
this.month = month;
this.day = day;

}
public String toString(){
  return "Task: " + task+ "             " + "Date " + month + "/" + day;
}

}