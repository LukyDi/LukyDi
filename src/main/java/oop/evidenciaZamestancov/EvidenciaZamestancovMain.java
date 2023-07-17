package oop.evidenciaZamestancov;

import java.time.LocalDate;

public class EvidenciaZamestancovMain {
    public static void main(String[] args) {

        Zamestnavatel ibm = new Zamestnavatel();
        ibm.setNazov("ibm");
        ibm.naplnZamestnancami();

        System.out.println("Informacie o zamestnavatelovi: " + ibm);
        ibm.vypisZamestancov();
        System.out.println("Pocet zamestancov vo firme je: " + ibm.pocetZamestancov());

        Zamestnavatel microsoft = new Zamestnavatel();
        microsoft.setNazov("Microsoft");
        Oddelenie pravneOddelenie = new Oddelenie("Pravne oddelenie", 1);

        Zamestnanec zamestnanec1 = new Zamestnanec("Eva", "Nádherná", LocalDate.of(1980, 6, 30),
                false, pravneOddelenie);

        microsoft.pridajZamestnanca(zamestnanec1);
        System.out.println("Informacie o zamestnavatelovi: " + microsoft);

        microsoft.vypisZamestancov();
        System.out.println("Pocet zamesntancov vo firme je : " + microsoft.pocetZamestancov());

    }
}
