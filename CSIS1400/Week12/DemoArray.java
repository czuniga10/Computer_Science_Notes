/********************************
* Chad Zuniga
*
* Demo how to use arrays
**********************************/
import java.util.Random;

public class DemoArray{
   public static void main(String[] args){
   //char array
      char[] vowels = {'l', 'i', 's', 't', 'e', 'n'};
      char temp = vowels[0];
      vowels[0] = vowels[vowels.length-1];
      vowels[vowels.length-1] = temp;
      for(int i = 0; i <=  vowels.length -1; i++){
         System.out.print(vowels[i]);
         
      }
      System.out.println();
      
   //int array
      int[] numbers = new int[10];
      initNumbers(numbers);
      printArray(numbers);
      System.out.printf("%d",linearSearch(numbers, 15));
      
   }
   //returns the index of the first occurance of the key
   //if the key is not contained in the array, it returns -1
   private static int linearSearch(int[] array, int key){
      for(int i = 0; i < array.length; i++){
         if(array[i] == key){
            return i;
         }
      }
      return -1;
   }
   
   private static void initNumbers(int[] array){
      Random rand = new Random();
      for(int i = 0; i <= array.length - 1; i++){
         array[i] = rand.nextInt(89) + 10;
      }
   }
   private static void printArray(int[] array){
      for(int el : array){
         System.out.print("" + el + " ");
      }
      System.out.println();
   }
}