public class GoodGuy
{
  private String name;
  private int strength;
  private int lifeBar;
  //constructor
  public GoodGuy(String name)
  {
    this.name = name;
    strength = setStrength();
    lifeBar = 100;
  }
  public String getName()
  {
    return name;
  }
  public int setStrength()
  {
    return (int)(Math.random()*50+50);
  }
  public int getStrength()
  {
    return strength;
  }
  public void setLifeBar()
  {
    
  }
  public String toString()
  {
    return ("Name: "+name+" Strength: "+strength+" LifeBar: "+ lifeBar);
  }
}