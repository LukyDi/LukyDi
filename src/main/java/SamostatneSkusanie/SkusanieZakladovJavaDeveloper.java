package SamostatneSkusanie;


// osobne skusanie somarin  kurzu Java Developer Junior z prezentacie od Zitniaka
public class SkusanieZakladovJavaDeveloper {

    // deklaracia Metody bez navratoveho typu - cize je to procedura :)

    static void procedura(int cislo) {
        System.out.println("Procedura do ktorej voslo cislo: " + cislo);

    }

    public static void main(String[] args) {
        // Skuska ternarneho operatora
        // funguje ako skratena podmienka if ' sprav toto (ak) ? vykona ak TRUE : vykona ak else resp false'

        int cislo = (int) (Math.random() * 5 + 1);
        int cislo1 = (cislo == 5) ? 1 : 3;
        System.out.println("Vyslo cislo: " + cislo + ". Test podmienky : " + cislo1 + ".");

        int den = (int) (Math.random() * 7 + 1);

        // skuska Metody Switch , ak sa ma pri rozdielnych vstupnych hodnotach ma vykonat to iste.
        switch (den) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(den + " je pracovny den"); // pre pripad ze vyde cislo 1-5 napise praconvy den
                break;
            case 6:
            case 7:
                System.out.println(den + " vikend");
                break;
            default:
                System.out.println(" Zle zadany den ");

        }

        // skuska procedury 'procedura'
        System.out.print("Metoda(cize procedura) vypis -> ");
        procedura(cislo1);
        System.out.println();

        // skuska vytvorenia pola a nasledneho vypisu

        int[] iPole = new int[20];
        for (int i = 0; i < iPole.length; i++) {
            iPole[i] = i + 1;
        }

        for (int i = 0; i < iPole.length; i++) {
            System.out.print(iPole[i] + ", ");
        }

        // Skuska dvojrozmerneho pola
        int[][] dvojRozmerne = new int[10][10];

        for (int i = 0; i < dvojRozmerne.length; i++) {
            for (int j = 0; j < dvojRozmerne[i].length; j++) {
                dvojRozmerne[i][j] = i * 10 + j;
            }
        }
        for (int i = 0; i < dvojRozmerne.length; i++) {
            for (int j = 0; j < dvojRozmerne[i].length; j++) {
                System.out.print(dvojRozmerne[i][j] + " ");
            }
            System.out.println();
        }
    }
}