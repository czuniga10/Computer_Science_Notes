/***************************************
* Author: Chad Zuniga
*
* Represents a point on th X&Y axis.
* Coordinates system where x and y are 
* whole numbers.
****************************************/


public class Point {
   //feilds
   private int x;
   private int y;

   
   //constructors
   
   //methods
   
   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }
   
   public void setX(int x) {
      this.x = x; //the field x gets a new value
   }
   //if the parameter name is the same as the field name,
   //the paramter shadows the field. Within the body of the 
   //method setX, x is always the parameter and never the field.
   //In order to access the field x, we need to write this.x
   public void setY(int y) {
      this.y = y;
   }
}