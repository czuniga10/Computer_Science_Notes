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
   private final int MAX_CHANNEL = 4;
   private final int MIN_CHANNEL = 1;
   private int channel = MIN_CHANNEL;
   
   
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
         channel = MIN_CHANNEL;
      }
   }

}