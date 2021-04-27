import java.util.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    boolean again = true;
    Scanner kb = new Scanner(System.in);
    Fish [] fishList = new Fish[10];
    int counter=0;
    while(again=true)
    {
      System.out.println("1]\t Add a new fish to the list.");
      System.out.println("2]\t Search for a fish from the list.");
      System.out.println("3]\t Delete a fish from the list.");
      System.out.println("4]\t Print all the fish in the list.");
      System.out.println("Make a selection: ");
      int num = kb.nextInt();
      if(num==1)
      {
        fishList[counter] = new Fish();
        counter++;
      }
      if(num==2)
      {
        System.out.println("Enter in the species name of the fish you'd like to search for.");
        String tempFish = kb.next();
        for(int i=0; i<counter; i++)
        {
          if(tempFish.equals(fishList[i].getSpecies()) && fishList[i] != null)
          {
            System.out.println("Species: " + fishList[i].getSpecies() + "\n" + "Water type: " + fishList[i].getWaterType() + "\n" + "Weight: " + fishList[i].getWeight() + "\n" + "Babies: " + fishList[i].getBabies()); 
          }
          else
          {
            System.out.println("There was no such fish in the list.");
          }
        }
      }
      if(num==3)
      {
        System.out.println("Enter in the species name of the fish you'd like to delete.");
        String tempFish = kb.next();
        for(int i=0; i<counter; i++)
        {
           if(tempFish.equals(fishList[i].getSpecies()) && fishList[i] != null)
           {
             fishList[i].wipeFish();
           }
           else
           {
              System.out.println("There was no such fish in the list.");
           }
        }
      }
      if(num==4)
      {
        for(int i=0; i<fishList.length; i++)
        {
          if(fishList[i] != null)
          {
            System.out.println("Fish: " + i + "/n" + "Species: " + fishList[i].getSpecies() + "\n" + "Water type: " + fishList[i].getWaterType() + "\n" + "Weight: " + fishList[i].getWeight() + "\n" + "Babies: " + fishList[i].getBabies()); 
          }
        }
      }
    }
  }
}