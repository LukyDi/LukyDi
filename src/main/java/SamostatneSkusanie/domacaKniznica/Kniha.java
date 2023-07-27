package SamostatneSkusanie.domacaKniznica;

public class Kniha {

    int id;
    String nazovKnihy;
    String autorKnihy;
    int rok_vydania;

    public Kniha(String nazovKnihy, String autorKnihy, int rok_vydania) {
        this.nazovKnihy = nazovKnihy;
        this.autorKnihy = autorKnihy;
        this.rok_vydania = rok_vydania;
    }

    public Kniha(int id, String nazovKnihy, String autorKnihy, int rok_vydania) {
        this.id = id;
        this.nazovKnihy = nazovKnihy;
        this.autorKnihy = autorKnihy;
        this.rok_vydania = rok_vydania;
    }

    @Override
    public String toString() {
        return "Kniha{" +
               "id=" + id +
               ", nazovKnihy='" + nazovKnihy + '\'' +
               ", autorKnihy='" + autorKnihy + '\'' +
               ", rok_vydania=" + rok_vydania +
               '}';
    }
}
