/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPriklady4;

/**
 *
 * @author Luky
 */

import java.util.Scanner;

public class FizzBuzz {
    
    
    public static void main(String args[] ){
    
   /*
    Hra
    Hráči zvyčajne sedia v kruhu. Prvý hráč povie číslo "1" a každý ďalší hráč 
    povie číslo o jedno vyššie od predošlého. Akékoľvek číslo deliteľné tromi 
    musí hráč nahradiť slovom fizz a akékoľvek číslo deliteľné piatimi slovom 
    buzz. Čísla deliteľné oboma sa nahrádzajú slovami fizz buzz. Hráč, ktorý 
    zaváha alebo urobí chybu je vylúčený z hry.
    Typická hra fizz buzz môže začínať takto:

    1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz,
        16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29,
        Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz,
   */
   Scanner scVstup = new Scanner(System.in);
   
   System.out.println("Zadaj max. cislo do ktoreho sa bude hrat FizzBuzz");
   int iVstup = scVstup.nextInt();
   
   for( int i = 1; i <= iVstup +1 ;i++){
       if( i/20 == 0 && i%20 == 0){
       System.out.println();    
        }
       if( i%3 == 0 && i%5 != 0){    
         System.out.print("Fizz, ");
            }else if(i%5 == 0 && i%3 != 0){
              System.out.print("Buzz, ");
             }else if(i%5 == 0 || i%3 == 0){
                   System.out.println("Fizz Buzz, ");
                  }else {
                        System.out.print(i + ", ");
                    }           
       }
   System.out.println("\nKoniec hry Fizz,Buzz. ");
    }  
   }

