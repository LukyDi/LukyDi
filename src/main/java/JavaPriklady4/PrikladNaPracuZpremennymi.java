/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPriklady4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Luky
 */
public class PrikladNaPracuZpremennymi {
 
    public static void main(String[] args) {
    // TODO Vypracovat do 19.40
/*
Úloha č.1: Príklad na prácu s premennými
Vypíšte do konzoly nasledujúci text:
Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5
a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
V Bratislave dňa 18.06.2022

Poznámka: Meno študenta + dátum narodenia, známku a rok + aktuálny dátum
    nastavte tak, aby sa dali meniť v zdrojovom kóde (t.j. cez premenné).
*/
    
    
        String menoStudenta = "Jozef Mrkvička";
        String datumNarodenia = "03.04.2000";
        double znamka = 1.5;
        String od = "septembra 2022";
        Date datum = new Date();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");
        
        System.out.println("Študent " + menoStudenta + " sa narodil " + datumNarodenia + ""
                + ", z maturitnej skúšky má známku " + znamka + " a od " + od + 
                " nastúpi do nového zamestnania ako Java programátor.");
        
        System.out.println("V Bratislave dňa " + formatDatumu.format(datum));
        
        System.out.printf("Študent má známku %.2f", znamka);
// TODO Vypiste znamku vo formate, ktory je akceptovatelny pre Slovaka, cize zobrazime desatinnu ciarku
        System.out.printf("Študent %s má známku %.1f", menoStudenta, znamka);
        
        
    }
}


