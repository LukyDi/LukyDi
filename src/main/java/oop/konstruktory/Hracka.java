package oop.konstruktory;

public class Hracka {
    //nazov, material, velkost, farba, cena, vek
    //atributy / premenne triedy = class fields
    private String nazov;
    private String material;
    private String farba;
    private double cena;
    private String vekoveUrcenie;

    public Hracka(){  // vytvorenie  konštruktora , bez parametrov.  material = "" - prazdny text.

        material = "Vyrobca neuvadza";
        vekoveUrcenie = "Vyrobca neuvázda";
    }
    // konštruktor s parametrami
    //Ak mame min. 2 konštruktory, ktoré sa líšia počtom parametrov, resp. jeden s nich je bez parametov
    // tak im hovorime, že su pretažené

    public Hracka(String nazov, String material, String farba, double cena, String vekoveUrcenie) {
        this.nazov = nazov;
        this.material = material;
        this.farba = farba;
        this.cena = cena;
        this.vekoveUrcenie = vekoveUrcenie;
    }

    public Hracka(String nazov, String material, String farba, String vekoveUrcenie) {
        this.nazov = nazov;
        this.material = material;
        this.farba = farba;
        this.vekoveUrcenie = vekoveUrcenie;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getVekoveUrcenie() {
        return vekoveUrcenie;
    }

    public void setVekoveUrcenie(String vekoveUrcenie) {
        this.vekoveUrcenie = vekoveUrcenie;
    }

    @Override
    public String toString() { // v returne sa dá prispôsobiť formát výpisu podľa seba.
        return "Hracka{\n" +
                "nazov='" + nazov + '\'' +
                ",\n material='" + material + '\'' +
                ",\n farba='" + farba + '\'' +
                ",\n cena=" + cena +
                ",\n vekoveUrcenie='" + vekoveUrcenie + '\'' +
                "\n}";
    }

   /* @Override
    public String toString() { // v returne sa dá prispôsobiť formát výpisu podľa seba.
        return "Hracka{" +
                "nazov='" + nazov + '\'' +
                ", material='" + material + '\'' +
                ", farba='" + farba + '\'' +
                ", cena=" + cena +
                ", vekoveUrcenie='" + vekoveUrcenie + '\'' +
                '}';
    }*/
}
