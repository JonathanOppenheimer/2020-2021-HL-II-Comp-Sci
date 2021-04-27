import java.util.*;

public class Fish
{
    private String species;
    private String waterType;
    private int weight;
    private int babies = 1; 
    Scanner kb = new Scanner(System.in);
    
    //constructor
    public Fish() {
        setSpecies();
        setWaterType();
        setWeight();
        babies = setBabies((int)Math.random()*10+1);
    }
    private void setSpecies()
    {
       System.out.println("What is the species of the fish you would like to enter?");
       species = kb.next();
    }
    public String getSpecies()
    {
      return species; 
    }
    private void setWaterType()
    {
       System.out.println("What is the water type of the fish you would like to enter?");
       waterType = kb.next();
    }
    public String getWaterType()
    {
      return waterType;
    }
    private void setWeight()
    {
      System.out.println("What is the weight of the fish you would like to enter?");
      weight = kb.nextInt();
    }
    public int getWeight()
    {
      return weight; 
    }
    private int setBabies(int x)
    {
      if(x>1)
      {
         babies = babies * x;
         setBabies(x-1); 
      }
      else 
      {
        babies = 1; 
      }
      return babies; 
    }
    public int getBabies()
    {
      return babies; 
    }
    public void wipeFish()
    {
      species = null;
      waterType = null;
      weight = 0; 
    }
    
}