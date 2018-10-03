/**************************
* Author: Chad Zuniga
*
* Demo writing for loops
* based on the following
* 2 patterns:
* a) do-something-N-times
* b) number-line
*
***************************/

public class LoopApp {
   public static void main(String[] args) {
      StdDraw.setPenColor(StdDraw.BOOK_RED);
      StdDraw.square(.2, .8, .1);
      StdDraw.setPenColor(StdDraw.BLACK);
      double[] x = { .1, .2, .3, .2 };
      double[] y = { .8, .9, .8, .7 };
      StdDraw.filledPolygon(x, y);
      
      //make a for loop to make the pattern .1, .15, .2, .25 instead of hard coding
      for(double i= 0.1; i <=0.25; i += 0.05) {
         StdDraw.filledSquare(i, .58, .02);
      }
      
//       StdDraw.filledSquare(.1, .58, .02);
//       StdDraw.filledSquare(.15, .58, .02);
//       StdDraw.filledSquare(.2, .58, .02);
//       StdDraw.filledSquare(.25, .58, .02);
      
      StdDraw.filledSquare(.8, .8, .2);
      StdDraw.circle(.8, .2, .2);

      StdDraw.setPenColor(StdDraw.BOOK_RED);
      StdDraw.setPenRadius(.02);
      StdDraw.arc(.8, .2, .1, 200, 45);

        // draw a blue diamond
      StdDraw.setPenRadius();
      StdDraw.setPenColor(StdDraw.BOOK_BLUE);
      x = new double[] { .1, .2, .3, .2 };
      y = new double[] { .2, .3, .2, .1 };
      StdDraw.filledPolygon(x, y);

        // text
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.text(0.2, 0.5, "black text");
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.text(0.8, 0.8, "white text");
   
   
   //demoDoSomethingNTimes();
   //demoNumberLine();
      
   }
   private static void demoDoSomethingNTimes() {
      //print ho three times
      for(int i = 0; i < 3; i++) {
         System.out.print("Ho ");
      }
      System.out.println();
      
      //use a for loop to print vulcano /"\ 4 times
      for(int i = 0; i < 4; i++) {
         System.out.print("/\"\\ ");
      }
      System.out.println();
   }
   
   private static void demoNumberLine() {
   //use a for loop to print -1 4 9 14
      for (int i = -1; i <= 14; i += 5) {
         System.out.print(i + " ");
      }
      System.out.println();
   // 2 -1 -4 -7
      for (int i = 2; i >= -7; i -= 3) {
         System.out.print(i + " ");
      }
      System.out.println();
   }
}