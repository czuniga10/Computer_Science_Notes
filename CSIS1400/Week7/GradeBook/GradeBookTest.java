import java.util.Scanner;

public class GradeBookTest {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      GradeBook myGradebook = new GradeBook();
      myGradebook.displayMessage("CSIS1400");
      myGradebook.determineClassAverage();
   }
}