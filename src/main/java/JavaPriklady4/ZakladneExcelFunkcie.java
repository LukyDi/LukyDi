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
public class ZakladneExcelFunkcie {
      
    public static void vypisPoleCezForEach( double [] a){
    
            for(double cisla:a){
            System.out.print(cisla +" ");
      }
    System.out.println();
     } 

    public static void vypisPole( double [] a){
    
       for(int i = 0 ; i < a.length; i++){
           System.out.print(a[i] + " ");
       } 
    System.out.println();    
    }
    
    public static double scitaj ( double [] a){
    double sum = 0 ;
    for(double cisla:a){
          sum += cisla ; 
      }
           
       
     return sum;
    }  
    public static double priemeruj( double [] a){
    double priemer;
    double sum = 0;
    
    for(double cisla:a){
          sum += cisla ;
    }
    
    priemer = sum / a.length;
    
    
    return priemer;
    }
    
    public static int pocet (double [] a){
    int pct = a.length;
        return pct;
    }
    
    public static double max ( double [] a){
        double maximum = 0;
    // Arrays.sort(a); return a[a.lenght-1]; zoradi cisla od min po max a vypise
    /* stacil 
     * double max ; 
     * for(double cisla:a){ 
     *  if (max < cislo ){ 
     *      max = cislo}
     *  }  
    */
        for(int i = 0 ; i < a.length ; i++){
          for(int j = 1 ; j < a.length ; j++){
             if( a[i] > a[j] && a[i] > maximum){
                maximum = a[i];
               }else if ( a[j] > maximum){
                maximum = a[j];
              }
          }
        }
           return maximum;
    }
    
    public static double min ( double [] a){
        double minimum = a[0];
    
        for(int i = 0 ; i < a.length ; i++){
          for(int j = 1 ; j < a.length ; j++){
             if( a[i] < a[j] && a[i] < minimum){
                minimum = a[i];
               }else if ( a[j] < minimum){
                minimum = a[j];
              }
          }
        }
           return minimum;
    }
    public static void main(String Args[]){
    
    /*Úloha na základné Excel funkcie.
     *Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme 
     *prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový 
     *súčet hodnôt.
     *
     *Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. 
     *v angličtine getSum()),
     *ktorá bude vracať výsledok po sčítaní. 
     */
    
   /* Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu priemeruj(), 
    * ktorá vypočíta priemer z daných čísiel.
    * Bonusové úlohy naviac: Vytvorte metódu pocet(),
    * ktorá zistí počet čísel v poli. Zároveň by tam mohla metóda, ktorá zisti
    * najväčšie číslo v poli max(). Analogicky aj metódu min(), ktorá zisti 
    * najmenšie číslo v poli.
    */
    
    double cisla[] = {1, 225 ,4 , 8.5 , 10} ;
    
    vypisPole(cisla);
    vypisPoleCezForEach(cisla);
    System.out.println(" Sucet pola je :" + scitaj(cisla));
    System.out.println(" Priemer pola je :" + priemeruj(cisla));
    System.out.println(" Pocet prvkov pola je :" + pocet(cisla));
    System.out.println(" Maximalne cislo z pola je :" + max(cisla));
    System.out.println(" Minimalne cislo z pola je :" + min(cisla));
    
    /*
    * Úloha na opakovanie: Vypíš maticu s údajmi od 1 do 25
    * Vytvorte (vypíšte) maticu údajov do konzoly, ktoré budú vyzerať nasledovne:
    * Bonusová úloha: Vytvorte obdobnú maticu, ktorá bude obsahovať 2-násobok 
    * tej predchádzajúcej hodnoty (začneme 1),
    */


    }
    
    
}
