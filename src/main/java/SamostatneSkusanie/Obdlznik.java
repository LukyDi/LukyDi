package SamostatneSkusanie;
// Konstruktory

public class Obdlznik {
    public int sirka;
    public int vyska;

    public Obdlznik(int parSirka, int parVyska) {
        sirka = parSirka;
        vyska = parVyska;
    }

    public int obvod() {
        int sirka;
        sirka = 2 * (this.sirka + vyska); // pomocou this sa odkazujeme na premennu triedy
        return sirka;
    }

    public int obsah() {
        return (sirka * vyska);
    }

    public static void main(String[] args) {
        Obdlznik obd = new Obdlznik(5, 3);
        System.out.println("Obvod obdlznika je: " + obd.obvod());
    }
}

