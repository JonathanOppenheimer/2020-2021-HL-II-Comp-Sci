import java.util.*;

public class Password {
    //UML diagram unified modeling language
    private String url;
    private String password;
    private String email;

    //constructor
    public Password() {
        setURL();
        setPassword();
        setEmail();
    }
    
    public Password(String url, String password, String email) {
        this.url = url;
        this.password = password;
        this.email = email;
    }
    
    public String toString() {
        return ("URL: " + url + "\n" + "Password: " + password + "\n" + "Email: " + email);
    }
    
    private void setURL() {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the url you would like to enter?");
        url = kb.next();
    }
    
    public String getURL() {
        return url;
    }
    
    private void setPassword() {
        password = "";
        for (int i = 0; i < 3; i++) {
            password = password + url.charAt(i);
        }
        password = (encrypt(password, -5));

        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == 'A' ||
                password.charAt(i) == 'E' ||
                password.charAt(i) == 'I' ||
                password.charAt(i) == 'O' ||
                password.charAt(i) == 'U') {
                count++;
            }
        }
        count = count * 100;
        password = password + Integer.toString(count);
        password = password + "W1!son";
    }


    public String getPassword() {
        return password;
    }

    private void setEmail() {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the email you would like to enter?");
        email = kb.next();
    }

    public String getEmail() {
        return email;
    }

    public static String encrypt(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c: str.toCharArray()) {
            sb.append((char)((c + n - 'A') % 26 + 'A'));
        }
        return sb.toString();
    }
}