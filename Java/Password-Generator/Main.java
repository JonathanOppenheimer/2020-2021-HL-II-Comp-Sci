import java.util.*; 

class Main {
  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter the domain.");
    String domain = kb.next(); 
    String oglength = domain; 
    System.out.println("Please enter your mother's maiden name");
    String maidenname = kb.next(); 
    
    String password = ""; 
    for(int i=0; i<4; i++)
    {
      password = password + domain.charAt(i);
    }
   for(int i=0; i<password.length(); i++)
   {
     if(password.charAt(i) == 'a' || 
     password.charAt(i) == 'e' ||
     password.charAt(i) == 'i' || 
     password.charAt(i) == 'o' ||
     password.charAt(i) == 'u')
     {
       password = password.substring(0, i) 
              + Integer.toString(i+1)
              + password.substring(i + 1); 
     }
   }
   password = password + "$$" + maidenname + "." + Integer.toString(oglength.length());
   System.out.println(password);
  }
/* 
1. add first four letters
2. each vowel in the password becomes the position its in 
3. add $$
4. add mother's maiden name
5. add a period
6. add number of characters in the whole thing */
}