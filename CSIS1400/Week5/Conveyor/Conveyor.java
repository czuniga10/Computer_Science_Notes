/***************************************
* Author: Chad Zuniga
*
* creates instance of conveyor and 
* initializes speed, distance, and type
****************************************/

public class Conveyor {
   //feilds
   private String type;
   private double speed;
   
   //constructors
   public Conveyor(String type, double speed) {
      this.type = type;
      setSpeed(speed);
   }
   
   //methods
   public String getType() {
      return type;
   }
   
   public double getSpeed() {
      return speed;
   }
   
   public void setSpeed(double speed) {
      // The speed is measured in m/s (meters per second)
      // only if size >= 0
      if(speed >= 0) {
         this.speed = speed;
      }
   }
   
   public double timeToTransport(double distance) {
      double t = distance / speed;
      return t; 
   }
}