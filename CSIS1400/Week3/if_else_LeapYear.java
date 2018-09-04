//Java code to check whether a year is a leap year

public class LeapYear {
   public static void main(String[] args) {
      
      int y = 2000;
      if (isLeapYear(y)) {
         System.out.printf("%d is a leap year.%n", y);
      }
      else {
         System.out.printf("%d is NOT a leap year.%n", y);
      }
   
   }
   
   //determins whether the given year is a leap year
   private static boolean isLeapYear(int year) {
      if(year % 4 == 0) {
         if(year % 100 == 0) {
            if(year % 400 == 0) {
               return true;
            }
            return false;
         }
         return true;
      }
      else {
         return false;
      }
   }
}