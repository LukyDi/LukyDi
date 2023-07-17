package oop;

public class DomaciMilacik {

    private String druh;
    private String farba;
    private int vek;

    public DomaciMilacik() { // prázdny konštruktor , dobrá prax. pre istotu, aby sme zadávali manuálne.
    }

    public DomaciMilacik(String druh, String farba, int vek) {
        this.druh = druh;
        this.farba = farba;
        this.vek = vek;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public String toString() {
        return "DomaciMilacik{" +
                "rasa='" + druh + '\'' +
                ", farba='" + farba + '\'' +
                ", vek=" + vek +
                '}';
    }
}
