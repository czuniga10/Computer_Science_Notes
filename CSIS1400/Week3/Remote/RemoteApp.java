/**********************************
* Author: Chad Zuniga
* 
* Test Client for data type Remote
************************************/

public class RemoteApp {
   public static void main(String[] args) {
      Remote myRemote = new Remote();
      
      myRemote.onOff();
      
      myRemote.channelUp();
      myRemote.channelUp();
      myRemote.channelUp();
      myRemote.channelUp();
      myRemote.channelUp();
      myRemote.channelUp();
      myRemote.channelUp();
      myRemote.channelUp();
      myRemote.channelUp();
      myRemote.channelUp();
      myRemote.channelUp();
      
      //Print values of on and channel
      System.out.printf("on: %b  channel: %d%n",
         myRemote.getOn(), myRemote.getChannel() );

   }
}