import java.util.Scanner;
public class RectangleMenu
{
	public static void main(String[] args)
	{
      Scanner input = new Scanner(System.in);
	   Rectangle myRectangle = new Rectangle(5,4);
      int selection;
      
      do {
         menuPrompt();
         selection = input.nextInt();
         switch(selection) {
            case 1:
               System.out.printf("Area: %d%n", myRectangle.area() );
               break;
            case 2:
               System.out.printf("Perimeter: %d%n", myRectangle.perimeter() );
               break;
            case 3: 
               System.out.printf("Length: %d | Width: %d%n", myRectangle.getLength(), 
                     myRectangle.getWidth() );
               break;
            case 0:
               System.out.println("good bye");
               break;
            default:
               System.out.println("invalid input");
               break;
         }
      }while(selection != 0);
  	}
	
	private static void menuPrompt()
	{
	   System.out.println("1 .. area");
		System.out.println("2 .. perimeter");
		System.out.println("3 .. length and width");
		System.out.println("0 .. exit");
		System.out.print("Your choice: ");
	}
}