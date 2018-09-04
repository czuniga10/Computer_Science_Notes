import java.util.Scanner;

public class LabMarbles {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("color: ");
     String color1 = input.nextLine();
     System.out.printf("Number of %s marbles: ", color1);
     int marbles1 = input.nextInt();
     input.nextLine();//Cleanup
     
     System.out.print("color: ");
     String color2 = input.nextLine();
     System.out.printf("Number of %s marbles: ", color2);
     int marbles2 = input.nextInt();
     input.nextLine();//Cleanup
     
     System.out.print("color: ");
     String color3 = input.nextLine();
     System.out.printf("Number of %s marbles: ", color3);
     int marbles3 = input.nextInt();
     input.nextLine();//Cleanup
     System.out.println();
     
     System.out.println("Color      Number of Marbles");
     System.out.println("---------- -----------------");
     System.out.printf("%-12s%-2d%n",color1, marbles1);
     System.out.printf("%-12s%-2d%n",color2, marbles2);
     System.out.printf("%-12s%-2d%n",color3, marbles3);
      
   }
}