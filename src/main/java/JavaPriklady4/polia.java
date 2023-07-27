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
public class polia {
     public static void main(String args[] ){
     
     String[] bicycles; // prazdne pole
     String[] cars = {"Volvo","BMW","Ford","Mazda"};
     
     //System.out.println(cars);//Nevypise ocakavani vysledok , nevypise obsah pola
     
     for(int i = 0 ; i < cars.length ; i++){ // sposob s pevnym poctom opakovani
         System.out.print(cars[i]);
     }
     for(String car:cars){ // druhy sposob foreach         
     System.out.println(car);
     }
     
     
     }
}
