/***************************************
* Author: Chad Zuniga
*
* Test client for class Point
****************************************/

public class PointApp {
   public static void main(String[] args) {
   
      Point myPoint = new Point();
      
      System.out.printf("myPoint: x=%d  y=%d%n", 
         myPoint.getX(), myPoint.getY() );
         
      myPoint.setX(3);
      myPoint.setY(2);
      
      System.out.printf("myPoint: x=%d  y=%d%n", 
         myPoint.getX(), myPoint.getY() );
   }
}