import java.util.Scanner;

public class GradeBook {
   public void displayMessage(String courseName) {
      System.out.printf("Welcome to the Grade Book for %s%n", courseName);
   }
   
   public void determineClassAverage(){
      Scanner input = new Scanner(System.in);
      int total = 0;
      int gradeCounter = 0;
      
      System.out.print("Enter grade or -1 to quit: ");
      int grade = input.nextInt();
      
      while(grade != -1) {
         total += grade;
         gradeCounter++;
         System.out.print("Enter grade or -1 to quit: ");
         grade = input.nextInt(); 
      }
      
      if(gradeCounter != 0) {
         double average = (double)total / gradeCounter;
         System.out.printf("Total of the %d grades entered is %d%n",gradeCounter, total);
         System.out.printf("Class average is: %.2f%n", average);
      }
      else {
         System.out.println("No grades were entered");
      }
      
      double average = (double)total / gradeCounter;
      if (average >= 90) {
         System.out.print("Letter grade: A");
      }
      else if(average >= 80){
         System.out.print("Letter grade: B");
      }
      else if(average >= 70){
         System.out.print("Letter grade: C");
      }
      else if(average >= 60){
         System.out.print("Letter grade: D");
      }
      else if(average < 60 && average > 0){
         System.out.print("Letter grade: F");
      }
      else {
      }
   }
}