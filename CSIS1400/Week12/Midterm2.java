/**********************************
* Author: Chad Zuniga
* 
* Generate 50 numbers from a range
* between -9 => 25 counting by 2's
************************************/
import java.util.Random;

public class MidtermExercise{
   public static void main(String[] args){
      Random rand = new Random();
      int number = 1;
      
      for(int i = 1; i <= 50; i++) {
         number = 2 * rand.nextInt(18) - 9;
         //replaces 7's with #'s
         if(number == 7){
            System.out.print("+#  ");
         }
         else if(number == -7){
            System.out.print("-#  ");
         }
         else if(number == 17){
            System.out.print("1#  ");
         }
         
         //prints all other numbers other than -7,7,17
         if(number != 7 && number > 0 && number < 10){
            System.out.printf("+%d  ", number);
         }
         else if(number != 7 && number != -7 && number != 17 ){
            System.out.printf("%d  ", number);
         }
         
         //prints new line after 8 columns
         if(i % 8 == 0){
            System.out.println();
         }
      }
      System.out.println();
      System.out.print("The End");
   }
}