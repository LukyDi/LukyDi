package oop;

public class SkladOvocia {
    public static void main(String[] args) {
        Ovocie jablko = new Ovocie();
        jablko.nazov = "Jablko";
        jablko.farba = "zelena";
        jablko.jeSladke = true;
        jablko.mnozstvoVitaminov = 90;
        jablko.odroda = "Red delicious";

        Ovocie hruska = new Ovocie();
        hruska.nazov = "Hruska";
        hruska.farba = "zelena";
        hruska.jeSladke = true;
        jablko.mnozstvoVitaminov = 80;
        hruska.odroda = "domaca";

        System.out.println("Nazov ovocia: " + jablko.nazov);
        System.out.println("Farba ovocia jablko: " + jablko.farba);
        System.out.println("Je sladke: " + jablko.jeSladke);
        System.out.println("Mnozstvo vitaminou" + jablko.mnozstvoVitaminov);
        System.out.println("Odroda: " + jablko.odroda);

        System.out.println("Nazov ovocia: " + hruska.nazov);
        System.out.println("Farba ovocia jablko: " + hruska.farba);
        System.out.println("Je sladke: " + hruska.jeSladke);
        System.out.println("Mnozstvo vitaminou" + hruska.mnozstvoVitaminov);
        System.out.println("Odroda: " + hruska.odroda);

    }

}
