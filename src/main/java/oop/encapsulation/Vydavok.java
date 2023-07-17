package oop.encapsulation;

public class Vydavok {
    private String nazov;
    private String kategoria;
    private double cena;
    // konstanta vzdy velkymi pismenami , ak bude static pristup bude Vydavok.dph , ak bez static tak instancia.DPH
    public static final double DPH = 0.20;



    public String getNazov() {
        //mozeme pridat aplikacnu logiku, ktora bude s premennou nazov nieco robit
        return nazov;
           }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
