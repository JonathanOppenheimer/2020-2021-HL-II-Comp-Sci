public class Number
{
  private int original;
  private String factors;
  private String primes;
  public Number(int original)
  {
    this.original = original;
  }
  private void setFactors()
  {
    factors = original+"";
    for(int i=original-1; i>=1; i--)
    {
      if(original%i==0)
      {
        factors = factors + "," + i;
      }
      System.out.println(factors);
    }
  }
  public String getFactors()
  {
    setFactors();
    return factors;
  }
  public String toString()
  {
    return "Number: " + original; 
  }
  private void setLowerPrimes()
  {
    primes = "2";
    for(int i=3; i<original; i++)
    {
      boolean isPrime = true;
      for(int j=2; j<i-1; j++)
      {
        if(i%j==0)
        {
          isPrime = false;
          break;
        }
      }
      if(isPrime==true)
      {
        primes = primes + ", " + i;
      }
    }
  }
  public String getLowerPrimes()
  {
    setLowerPrimes();
  }
}