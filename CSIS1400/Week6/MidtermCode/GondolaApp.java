/**********************************
* Author: Chad Zuniga
* 
* Test Client for data type Gondola
************************************/

public class GondolaApp {
   public static void main(String[] args) {
      Gondola myGondola = new Gondola();
      
      System.out.printf("count: %d%n", myGondola.getCount() );
      myGondola.enter(6);
      myGondola.start();
      myGondola.enter(4);
      
      System.out.printf("count: %d%n", myGondola.getCount() );
      myGondola.exit();
      myGondola.stop();
      myGondola.enter(5);
      myGondola.enter(4);
      
      System.out.printf("count: %d%n", myGondola.getCount() );
      myGondola.exit();
   }
}