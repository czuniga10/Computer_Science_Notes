/***********************
* Author: Chad Zuniga
* 
* Data type that represents
* a remote control. Turns 
* off and on.
*************************/

public class Remote {
   //field
   private boolean on;
   private int channel;
   private final int MAX_CHANNEL = 4;
   
   
   //constructor
   
   //methods
   public void onOff() {
      if (on == false) {
         on = true;
      }
      else {
         on = false;
      }
   }
   
   public void channelUp() {
      channel += 1;
      if (channel > MAX_CHANNEL) {
         channel = 0;
      }
   }

}