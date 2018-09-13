/***************************************
* Author: Chad Zuniga
*
* Creates class of Point and adds
* feilds and methods to it.
****************************************/


public class Ball {
   //feilds
   private double size;

   //constructors
   
   //methods
 
   public double getSize() {
      return size;
   }
   
   public void setSize(double size) {
      if(size >= 0) {
         this.size = size;
      }
   }
   
   public void roll() {
      System.out.println("rolling...");
   }
   
   public void bounce(int numberOfBounces) {
      System.out.printf("bouncing %d times", numberOfBounces);
   }
}