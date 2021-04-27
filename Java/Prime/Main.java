class Main {
    public static void main(String[] args) 
    {
      for(int i=100; i>=2; i++)
      {
        boolean prime = true;
        for(int j=i-1; j>=2; j++)
        {
          if(i%j==0)
          {
            prime=false;
          }
        }
        if(prime)
        {
          System.out.println(i);
        }
      }
    }
  }