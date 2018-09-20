/*************************
* Author: Chad Zuniga
* 
* Char Lab
**************************/

public class Char {
   public static void main(String[] args) {
      char dash = '-';
      System.out.printf("Dash:%c%n", dash);
      
      char a = 'a';
      char letter = a;
      letter++;
      char b = letter;
      letter++;
      char c = letter;
      letter += 2;
      char e = letter;
      System.out.printf("Letter:%c a:%c b:%c c:%c e:%c%n", 
            letter, a, b, c, e);
      
      char copyrightSign = '\u00A9';
      System.out.printf("Copyright sign: %c %.0f %X%n", 
            copyrightSign, (double)copyrightSign, (int)copyrightSign);
      
      char yen = '¥';
      System.out.printf("Yen: %c %.0f %X%n", 
            yen, (double)yen, (int)yen);
   }
}

/************************

sample output:

Dash:-
Letter:e a:a b:b c:c e:e
Copyright sign: © 169 A9
Yen: ¥ 165 A5

*************************/