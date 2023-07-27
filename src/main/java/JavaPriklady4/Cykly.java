package JavaPriklady4;

public class Cykly {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("\t" + j * i);
            }
            System.out.println("\nĎalšia iterácia vonkajšieho cyklu");
        }
        System.out.println("-- KONIEC --");

        int cislo = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(cislo + "\t");
                cislo *= 2;
            }
            System.out.println();
        }
    }
}
