public class BadGuy
{
  private String name;
  private int lifeBar;
  private int evilPowers;
  
  public BadGuy(String name)
  {
    this.name = name;
    lifeBar = 100;
    evilPowers = setEvilPowers();
  }
  public String getName()
  {
    return name;
  }
  public int getLifeBar()
  {
    return lifeBar;
  }
  public void setLifeBar(int hit)
  {
    lifeBar = lifeBar - hit;
  }
  public int setEvilPowers()
  {
    return (int)(Math.random()*25+30);
  }
  public String toString()
  {
    return ("Name: "+name+" Evil Powers: "+ evilPowers+" LifeBar: "+lifeBar);
  }
}