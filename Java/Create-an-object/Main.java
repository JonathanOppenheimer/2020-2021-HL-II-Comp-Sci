class Main {
    public static void main(String[] args) {
      
      Password pass1 = new Password();
      System.out.println(pass1 + "\n");
      
      Password pass2 = new Password("Amazon.com", "ILoveViolet", "snyder@fccps.org");
       System.out.println(pass2);
    }
  }