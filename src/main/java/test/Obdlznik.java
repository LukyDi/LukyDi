package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
ZADANIE:
Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy.
Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na výpočet jeho obsahu (vypocitajObsah).
Vytvorte jUnit testy, ktore otestuju funkcnost metod vypocitajObvod a vypocitajObsah

*/

public class Obdlznik {

    public static double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }

    public static double vypocitajObsah(double stranaA, double stranaB) {
        return stranaA * stranaB;
    }

    public static void main(String[] args) {

        double a = 2.5; // Strana a
        double b = 3.5; // Strana b

        System.out.println("Obvod obdĺžnika je: " + Obdlznik.vypocitajObvod(a, b));
        System.out.println("Obsah obdĺžnika je: " + Obdlznik.vypocitajObsah(a, b));

    }

    // Tento test ma byt v samostatnej Triede
    @Test
    @DisplayName("Testy na vypocet obvodu")
    public void testVypocitajObvod() {
        assertEquals(10, Obdlznik.vypocitajObvod(2, 3));
        assertEquals(13, Obdlznik.vypocitajObvod(2.5, 4));
    }
    @Test
    @DisplayName("Test na vypocet obsahu ")
    public void testVypocitajObsah(){

        assertEquals(10,Obdlznik.vypocitajObvod(2,5));
        assertEquals(25,Obdlznik.vypocitajObsah(5,5));
    }

}
