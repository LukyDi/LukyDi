package oop.konstruktory;

public class Hrackarstvo {
    public static void main(String[] args) {
        //Vytvorime novu hracku

        Hracka moncici = new Hracka();
       /* Vytvorili sme novy objekt  Hracka s nazvom moncici Hracka
          v triede hracka sme si vytvorili konštruktor Hracka(Rovnaky nazov ako nazov objektu - schválne),
          ktorý preddefinuje hodnoty atribútov , ktoré sa môžu prepísať.Ak sa neprepíšu ostanú tie preddefinované
       */
        moncici.setNazov("Mončiči");
        moncici.setCena(15.0);
        moncici.setFarba("ružové");
        moncici.setMaterial("plyš");
        moncici.setVekoveUrcenie("0-99");

        // Vypis hračky
        System.out.println("Atribúty hračky");
        System.out.println("Názov " + moncici.getNazov());
        System.out.println("Cena: " + moncici.getCena() );
        System.out.println("Farba: " + moncici.getFarba());
        System.out.println("Materiál: " + moncici.getMaterial());
        System.out.println("Vekove určenie: " + moncici.getVekoveUrcenie() );

        // Vytvorime druhu hračku
        Hracka lego = new Hracka("lego","plast","rôzna",15.50,"0-99");

        // Vypis druhej hračky
        System.out.println("Atribúty hračky");
        System.out.println("Názov " + lego.getNazov());
        System.out.println("Cena: " + lego.getCena() );
        System.out.println("Farba: " + lego.getFarba());
        System.out.println("Materiál: " + lego.getMaterial());
        System.out.println("Vekove určenie: " + lego.getVekoveUrcenie() );

        // Vytvorime tretiu hracku

        Hracka merkur = new Hracka("merkur","kov","rôzna","0-99");
        System.out.println("Atribúty tretej hračky");
        System.out.println(merkur);// vypis pomocou toString (Override) v triede

        // Vytvorime stvrtu hracku

        Hracka bycikel = new Hracka("bycikel", "karbón"," rôzna", 1200,"3-99");






   }
}
