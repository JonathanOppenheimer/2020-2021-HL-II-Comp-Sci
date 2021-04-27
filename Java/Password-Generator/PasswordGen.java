import java.util.*;
class PasswordGen {
  public static void main(String[] args) {
    //first three letters +1 letter
    //num of vowels * 100
    //W!lson
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter in a URL");
    String url = kb.next();
    String password = "";
    char letter1 = url.charAt(0);
    char letter2 = url.charAt(1);
    char letter3 = url.charAt(2);
    letter1 = (char)((int)(letter1)+1);
    letter2 = (char)((int)(letter2)+1);
    letter3 = (char)((int)(letter3)+1);
    String l1 = letter1+"";
    String l2 = letter2 +"";
    String l3 = letter3 +"";
    password = l1+l2+l3;
    System.out.println(password);
    int counter=0;
    url = url.toUpperCase();
    for(int i=0; i<url.length();i++)
    {
      if(url.charAt(i)=='A'||url.charAt(i)=='E'||url.charAt(i)=='I'||url.charAt(i)=='U'
      ||url.charAt(i)=='O')
        counter++;
    }
    password = password + ""+counter*100;
    System.out.println(password);
    
  }
}