package oop;

public class EvidenciaVozidiel {

    public static void main(String[] args) {
        Auto auto1 = new Auto();

        auto1.nazovZnacky = "Volvo";
        auto1.farba = "Siva";
        auto1.druhPohonu = "elektricke";

        Auto auto2 = new Auto();

        auto2.nazovZnacky = "Audi";
        auto2.farba = "Cierna";
        auto2.druhPohonu = "Diesel";

        Auto auto3 = new Auto();

        auto3.nazovZnacky = "Toyota";
        auto3.farba = "Cervena";
        auto3.druhPohonu = "benzin";

        System.out.println("Znacka auta je: " + auto1.vypisZnacku()+ ".");
        System.out.println("Farba vozidla je: " +  auto1.farba + ".");
        System.out.println("Pohon vozidla je "+ auto1.druhPohonu + ".");

        System.out.println("Znacka auta je: " + auto2.vypisZnacku()+ ".");
        System.out.println("Farba vozidla je: " +  auto2.farba + ".");
        System.out.println("Pohon vozidla je "+ auto2.druhPohonu + ".");

        System.out.println("Znacka auta je: " + auto3.vypisZnacku()+ ".");
        System.out.println("Farba vozidla je: " +  auto3.farba + ".");
        System.out.println("Pohon vozidla je "+ auto3.druhPohonu + ".");


    }
}
