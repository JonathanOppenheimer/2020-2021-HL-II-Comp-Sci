import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter how many names you would like to enter.");
    int total = kb.nextInt(); 
    String[] names = new String[total];
    
    for(int i=0; i<names.length; i++)
    {
      System.out.println("Please enter name number " + (i+1) + ".");
      names[i] = kb.next();
    }
    
    double charcount = 0.0;
    for(int i=0; i<names.length; i++)
    {
      charcount = charcount + names[i].length();
    }
    
    double export = charcount/total;
    
    System.out.println("The average number of letters in the first names was " + export + " letters.");
    
  }
}