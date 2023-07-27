package JavaPriklady4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScitanieVstupnychHodnotCezArrayList {

    /*Vytvorte dynamicke pole (prostredníctvom ArrayList), ktoré od používateľa bude žiadať zadanie číselných hodnôt
     * tie budeme do dynamického poľa pridávať. Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
     * Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
     * Poznámka: Skúsme “ošetriť” zadanie textových hodnôt tak, aby program nespadol.
     * Bonusová úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.
     */


    public static void main(String[] args) {
        ArrayList<Double> dynamickePoleCisel = new ArrayList<>();
        double cislo = 0;
        double sum = 0;

        do {
            Scanner scn = new Scanner(System.in);
            System.out.print("Zadaj akékoľvek celé číslo, ak zadáš zápornú ukončím program a vypíšem pole: ");
            try {
                cislo = scn.nextDouble(); // caka na konkretny vstup od pouzivatela
            } catch (InputMismatchException e) {
                cislo = 0;
                System.out.println("Zadal si nespravny format cisla");

            }
            dynamickePoleCisel.add(cislo);
            System.out.println();
        } while (cislo >= 0);

        for (double cisla : dynamickePoleCisel) {
            System.out.print(cisla + ", ");
        }
        System.out.println();
        for (int i = 0; i < dynamickePoleCisel.size() - 1; i++) {
            sum += dynamickePoleCisel.get(i);
        }
        System.out.println("Sucet vsetkych cisel: " + sum);

        /* Zadajte názvy kníh cez konzolu, kým používateľ nenapíše slovo koniec. Následne zoznam kníh vypíšte.
         * Používanie aplikácie: Používateľ spustí program s názvom ZadavanieKnih (InputBooks),
         * ktorý vyzve na zadanie názvov kníh. Zároveň mu vypíše inštrukciu, že po zadaní slova koniec program zadávanie
         * ukončí a následne vypíše zoznam všetkých zadaných kníh.
         */

        ArrayList<String> Kniznica = new ArrayList<>();
        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Vytvorim zoznam knih, zadaj nazov knihy a stlac ENTER. Slovom \" koniec\" skoncim ");
            String kniha = scn.nextLine();
            if (kniha.toLowerCase().equals("koniec")) break;
            Kniznica.add(kniha);
        }

        for (String zoznamKnih : Kniznica) {
            System.out.print(zoznamKnih +", ");
        }
        System.out.print("....KONIEC.../n");

    }
}