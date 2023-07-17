package oop.evidenciaZamestancov;

import java.time.LocalDate;
import java.util.ArrayList;

public class Zamestnavatel {
    String nazov;

    private ArrayList<Zamestnanec> zoznamZamestnancov = new ArrayList<>();

    public Zamestnavatel() { // aj tu sme mohli vytvorit oddelenia a zamestancov
    }

    ;

    public void naplnZamestnancami() {

        Oddelenie marketingoveOddelenie = new Oddelenie(); // Vytvoril som prazdne maketingove oddelnie
        marketingoveOddelenie.setNazov("Marketingove oddelenie");
        marketingoveOddelenie.setPoschodie(2);

        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.setMeno("Ján");
        zamestnanec1.setPriezvisko("Žitniak");
        zamestnanec1.setDatumNarodenia(LocalDate.of(2000, 6, 4));
        zamestnanec1.setJeVeduci(true);
        zamestnanec1.setOddelenie(marketingoveOddelenie);// priradili sme zamestantcovi oddelenie

        // vytorime daľšie oddelenie a nejakeho zamestnanca
        Oddelenie itOddelenie = new Oddelenie("IT Oddelenie", 3);
        Zamestnanec zamestnanec2 = new Zamestnanec("Jožko", "Mrkvička",
                LocalDate.of(1999, 12, 31), false, itOddelenie);

        // Vytvaranie dalšieho zamestanca
        Zamestnanec zamestnanec3 = new Zamestnanec("Zuzana", "Pekná",
                LocalDate.of(2005, 1, 1), false, itOddelenie);

        // do Array Listu pridame zamestanov
        zoznamZamestnancov.add(zamestnanec1);
        zoznamZamestnancov.add(zamestnanec2);
        zoznamZamestnancov.add(zamestnanec3);
    }

    public void vypisZamestancov() {
        System.out.println("\n");
        System.out.println("Informacie o zamestnancovi/och");
        for (Zamestnanec konkretnyZamestnanec : zoznamZamestnancov) {
            System.out.println("Detaily od zamestancovi: " + konkretnyZamestnanec);
        }
    }

    public int pocetZamestancov() {
        return zoznamZamestnancov.size();
    }

    public void pridajZamestnanca(Zamestnanec zamestnanec) {
        zoznamZamestnancov.add(zamestnanec);

    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    @Override
    public String toString() {
        return "Zamestnavatel{" +
               "nazov='" + nazov + '\'' +
               '}';
    }
}
