
import java.util.Scanner;
public class Purchase {
  public static void main(String[] args) {
    // variables
    Scanner keyboard;
    boolean moreNumbers;
    double price;
    int number;
    String answer;

    // ask before iterating loop (with error)
    keyboard = new Scanner(System.in);
    moreNumbers = true;
    while (moreNumbers) {
      System.out.println("Enter price $");
      price = keyboard.nextDouble();
      System.out.print("Enter number purchased:");
      number = keyboard.nextInt();
      System.out.println(number + " items at $" + price);
      System.out.println("Total cost $" + price*number);
      System.out.println("Want to make another purchase?");
      System.out.println("Enter yes or no");
      answer = keyboard.next();
      if(answer == "no") 
        !moreNumbers
    } 
  }
}