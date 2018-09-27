/*******************************************
* Author: Chad Zuniga
*
* Midterm 1 - 
* Gondola creates blueprint of Gondola and 
* initializes capacity, count, and isMoving
*******************************************/

public class Gondola {
   //fields
   private final int CAPACITY = 10;
   private int count;
   private boolean isMoving;
   //constructors
   //methods
   public void start() {
      isMoving = true;
      System.out.println("starting ...");
   }
   
   public void stop() {
      isMoving = false;
      System.out.println("stopping ...");
   }
   
   public int getCount() {
      return count;
   }
   
   public void enter(int groupSize) {
      //askes if Gondola is moving
      if(isMoving == false) {
         //askes if Gondola will be greater than capacity with added group size
         if( (count + groupSize) <= CAPACITY) {
            System.out.printf("A group of %d entered%n", groupSize);
            count += groupSize;
         }
         else {
            System.out.println("Sorry, nobody can enter the gondoal");
         }
      }
      else {
         System.out.println("Sorry, nobody can enter the gondoal");
      }
   }
   
   public void exit() {
      //askes if Gondola is moving
      if(isMoving == false) {
         count = 0;
         System.out.println("Everyone is exiting");
      } else {
         System.out.println("Can't exit while moving");
      }
   }
}