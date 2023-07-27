package JavaPriklady4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPriklad {

    public static double vypocitajObvod(double  stranaA, double stranaB){
        return 2 * (stranaA + stranaB);
          }

    public static double vypocitajObsah(double  stranaA, double stranaB){
        return stranaA * stranaB;
    }

    static void checkAge(int age){
       if ( age < 18) {
           throw new ArithmeticException("Access denied - You must be at last 18 ears old");
       } else
           System.out.println("You are old enought - Access granted");

    }
    public static void main(String[] args) {

        double a = 2.5; // strana A
        double b = 3.5; // strana B

      while(true){
          Scanner scn = new Scanner(System.in); // Inicializacia konzoli System.in
          try { // osetrenie chyby

              System.out.println("Zadaj stranu a:");
              a = scn.nextDouble();
              System.out.println("Zadaj stranu b:");
              b = scn.nextDouble();

              System.out.println("Obvod obdlznika je:" + vypocitajObvod(a,b));
              System.out.println("Obsah obdlznika je:" + vypocitajObsah(a,b));
             break; //ukonci while
          }catch (InputMismatchException e) { // Tu napisem kod ktory naraba s chybou

              System.out.println("Chyba vo vstupnych hodnotach!");
              e.printStackTrace();{
                  System.out.println("Neznama chyba!");
              }
              e.printStackTrace();
          } finally {
              System.out.println("Vola sa kod, ktory sa nachadza vo finally");
          }
          //System.out.println("Uzatvaram vstupy cez Scanner.");
          // scn.close();
          //break;

         /* double delenie = a / b;
          System.out.println("Výsledok delenia je: " + delenie);
      } catch (ArithmeticException e) { // Exception je rodic vsetkych exceptions, lepsie je konkretizovat
            System.out.println("Problém s delením");
        }
        */

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Odkazujete sa na prvok poľa mimo rozsah.");
        }


        checkAge(20); // Set age to 15 (which is below 18...)



    }
    }
}
