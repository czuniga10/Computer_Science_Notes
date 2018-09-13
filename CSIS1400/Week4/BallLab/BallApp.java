/***************************************
* Author: Chad Zuniga
*
* Test client for class Ball
****************************************/

public class BallApp {
   public static void main(String[] args) {
   
      Ball myBall = new Ball();
      
      myBall.setSize(5);
      System.out.printf("Ball with size %.0f%n", myBall.getSize() );
      
      myBall.roll();
      
      myBall.bounce(14);
      System.out.println();
      
      myBall.setSize(7);
      System.out.printf("Size: %.0f", myBall.getSize() );
   }
}