class Main {
    public static void main(String[] args) {
     GoodGuy guy1 = new GoodGuy("Katie");
     System.out.println(guy1);
     BadGuy guy2 = new BadGuy("Abby");
     System.out.println(guy2);
     int num1=(int)(Math.random()*100);
     if(num1<guy1.getStrength())
     {
       System.out.println("HIT");
       guy2.setLifeBar(20);
     }
     else
     {
       System.out.println("MISS");
       guy2.setLifeBar(-20);
     }
     System.out.println(guy2);
     
    }
  }