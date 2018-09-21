/***************************************
* Author: Chad Zuniga
*
* Test client for class Conveyor 
****************************************/

public class ConveyorApp {
   public static void main(String[] args) {
      Conveyor conveyor1 = new Conveyor("flat belt", 0.9);
      Conveyor conveyor2 = new Conveyor("roller", -0.5);
      int m = 50;
      
      System.out.printf("Conveyor1: %s conveyor with a speed of %.1f m/s%n", 
            conveyor1.getType(), conveyor1.getSpeed() );
      System.out.printf("Time to transport an item %d m: %.1f s%n", 
            m, conveyor1.timeToTransport(m) );
      System.out.println();
      System.out.printf("Conveyor2: %s conveyor with a speed of %.1f m/s%n", 
            conveyor2.getType(), conveyor2.getSpeed() );
      System.out.printf("Time to transport an item %d m: %.1f s%n", 
            m, conveyor2.timeToTransport(m) );
      System.out.println();
      
      conveyor1.setSpeed(-3);
      conveyor2.setSpeed(0.4);
      System.out.println(".. updating speed");
      System.out.println();
      
      System.out.printf("Conveyor1: %s conveyor with a speed of %.1f m/s%n", 
            conveyor1.getType(), conveyor1.getSpeed() );
      System.out.printf("Time to transport an item %d m: %.1f s%n", 
            m, conveyor1.timeToTransport(m) );
      System.out.println();
      System.out.printf("Conveyor2: %s conveyor with a speed of %.1f m/s%n", 
            conveyor2.getType(), conveyor2.getSpeed() );
      System.out.printf("Time to transport an item %d m: %.1f s%n", 
            m, conveyor2.timeToTransport(m) );
   }
}