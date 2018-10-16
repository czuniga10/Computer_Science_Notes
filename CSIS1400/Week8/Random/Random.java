/***********************
* Author: Chad Zuniga
* Class: CSIS 1400
*
* Lab Random Number
************************/
import java.util.Random;

public class LabRandom {
   public static void main(String[] args) {
      Random rand = new Random();
      int number;
      
      for(int i = 1; i <= 100; i++) {
         number = rand.nextInt(4) + 4;
         System.out.printf("%-5d", number);
         if(i % 10 == 0) {
            System.out.println();
         }
      }
   }

}