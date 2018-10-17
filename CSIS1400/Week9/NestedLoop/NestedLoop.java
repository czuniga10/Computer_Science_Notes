/********************************
* Author: Chad
* 
* Demo drawing geometric patterns
* using nested loops
**********************************/

public class NestedLoops {
   public static void main(String[] args){
      //first loop is how many rows
      for(int i = 0; i < 4; i++) {
         //printing first character i times
         for(int j = 0; j < i; j++) {
            System.out.print("  ");
         }
         //print second character a constant(4) times
         System.out.print("o o o o ");
         //loop for 3rd character
         for(int j = 0; j < (5-i); j++) {
            System.out.print(". ");
         }
         //loop for 4th character
         for(int j = 0; j < (4-i); j++) {
            System.out.print("* ");
         }
         //constant for 5th
         System.out.println("@ ");
      }
   }
}