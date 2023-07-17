package oop.encapsulation;

public class EvidenciaVydavkov {

    public static void main(String[] args) {
        Vydavok chlieb = new Vydavok();

        //Pouzivanie setterov
        chlieb.setNazov("CiernyChleba");
        chlieb.setCena(1.98);
        chlieb.setKategoria("Potraviny");

        //Pouzivanie getterov Vypis obsahu objektu chlieb
        System.out.println("Nazov vydavku: " + chlieb.getNazov());
        System.out.println("Cena: "+ chlieb.getCena());
        System.out.println("Kategoria : " + chlieb.getKategoria());
        System.out.println("DPH na chlieb je: " + (chlieb.getCena() * Vydavok.DPH));
    }
}
