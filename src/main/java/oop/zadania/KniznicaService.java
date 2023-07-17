package oop.zadania;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class KniznicaService {

    // bezparametricky končtruktor
    ArrayList<Kniha> zoznamKnih = naplnKniznicuKnihami(); // My sme vytovrili prazdnu objekt, resp. ArrayList ako prazdne

    public KniznicaService() {
    }

    public void zobrazMenu() {
        System.out.println("--------------------------------------------------------\n" +
                           "---------------------- Menu s možnosťami ---------------\n" +
                           "- 1.Zadaj novú knihu                                   -\n" +
                           "- 2.Zobraz všetky knihy                                -\n" +
                           "- 3.Zobraz konkrétnu knihu (podľa indexu)              -\n" +
                           "- 4.Vymaž konkrétnu knihu (podľa indexu)               -\n" +
                           "- 5.Zobraz počet všetkých kníh                         -\n" +
                           "- 6.Vyhľadaj knihu podľa textu                         -\n" +
                           "- 7.Načítaj zoznam kníh zo súboru (Zadaj názov súboru) -\n" +
                           "- 8.Ulož zoznam kníh zo súboru   (Zadaj názov súboru)  -\n" +
                           "- 9.Vymaž všetky knihy                                 -\n" +
                           "- koniec = skončí sa program                           -\n" +
                           "- - - - - - - - - Každú voľbu potvrď ENTER-om  - - - - -\n" +
                           "--------------------------------------------------------\n");
    }

    public ArrayList<Kniha> naplnKniznicuKnihami() {
        // Vytvorime prvu ukazkovu knihu, teda objekt kniha1 + AI(ChatGPT)

        Kniha kniha1 = new Kniha("Já, robot", "Isaac Asimov", 1985);
        Kniha kniha2 = new Kniha("1984", "George Orwell", 1985);
        Kniha kniha3 = new Kniha("To Kill a Mockingbird", "Harper Lee", 1942);
        Kniha kniha4 = new Kniha("Malý princ", "Antoine de Saint-Exupéry", 1750);
        Kniha kniha5 = new Kniha("Pán prsteňov", "J.R.R. Tolkien", 1989);

        // Vytvorenie dynamickeho pola, teda ArrayListu-u v ktorom ulozime knihy

        ArrayList<Kniha> zoznamKnih = new ArrayList<>();
        zoznamKnih.add(kniha1); // do zoznamKnih, cize ArrayList sme ulozily 1.knihu
        zoznamKnih.add(kniha2); // do zoznamKnih, cize ArrayList sme ulozily 2.knihu
        zoznamKnih.add(kniha3); // do zoznamKnih, cize ArrayList sme ulozily 3.knihu
        zoznamKnih.add(kniha4); // do zoznamKnih, cize ArrayList sme ulozily 4.knihu
        zoznamKnih.add(kniha5); // do zoznamKnih, cize ArrayList sme ulozily 5.knihu

        return zoznamKnih;
    }

    public Kniha pridajKnihu() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj nazov knihy: ");

        String nazov = scn.nextLine();

        System.out.println("Zadaj autora knihy: ");

        String autor = scn.nextLine();

        System.out.println("Zadaj rok vydania knihy: ");

        int rokVydania = scn.nextInt(); // caka na pouzivatelsky vstup, ktory bude cele cislo

        // Vytvorili sme na knihu na zaklade pouzivatelkych dat

        return new Kniha(nazov, autor, rokVydania);
    }

    /* public List<String> findUsingLoop(String search, ArrayList<String> list) {
         List<String> matches = new ArrayList<>();
         for (String str : list) {
             if (str.contains(search)) {
                 matches.add(str);
             }
         }
         if (matches.isEmpty()) matches.add("neexistuje!");
         return matches;
     }
     // v hlavnom main

       ArrayList<String> listZoznam = new ArrayList<>();
                    for (Object zoznam : zoznamKnih) {
                        listZoznam.add(zoznam.toString());
                    }
                    System.out.println("Zadaj autora, názov diela alebo jeho časť, ktorý chceš vyhľadať : ");
                    String search = scn.nextLine();
                    System.out.println("Vami hladaná kniha : " + findUsingLoop(search, listZoznam));
     */
    public void hladajKnihyPodlaNazvu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj názov knihy");
        String hladanyNazov = scn.nextLine();

        ArrayList<Kniha> najdeneKnihy = new ArrayList<>();// prazdny zoznam nájdených kníh
        for (Kniha konkretnaKniha : zoznamKnih) {//foreach pre prechadzanie kazdej knihy v našom zozname kníh
            if (konkretnaKniha.getNazov().contains(hladanyNazov))//Obsahuje názov konkretnej knihy aspoň časť názvu knihym ktorú hľadáme?
            najdeneKnihy.add(konkretnaKniha); // Ak takú nájde , tak ju uloží do zoznamu najdenéKnihy
        }

        //Vypíšeme nájdené knihy
        System.out.println("\nNájdené knihy sú tieto: ");
        for (Kniha najdenaKniha : najdeneKnihy) {
            System.out.println(najdenaKniha);
        }
    }

    //metoda ulozDoSuboru vyzve pouzivatela na zadanie nazvu suboru a nasledne ho ulozi
    public void ulozDoSuboru() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj názov súboru");
        String nazovSuboru = scn.nextLine();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(nazovSuboru);
            // vytvorime subor s nazvom kniha.ser(ser ako serialize). To báva štandardom , ale pre tento prípad nie :)
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            // vytvorime Objekt stream pre ukladanie objektov
            objectOutputStream.writeObject(zoznamKnih); // zapiseme objekt
            objectOutputStream.flush(); // realne uskustocnime operaciu zapisu
            objectOutputStream.close(); // zatvorime objekt output stream
            fileOutputStream.close(); // zatvorime file output stream , cize subor
            System.out.println("Súbor bol úspešne uložený");
        } catch (IOException e) {
            System.out.println("Nepodaril sa uložiť súbor!");
            e.printStackTrace();
        }
    }

    public void nacitajZoSuboru() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj názov súboru, ktorý chceš načítať");
        String nazovSuboru = scn.nextLine();
        try {
            // nacitanie ArrayList
            FileInputStream fileInputStream = new FileInputStream(nazovSuboru);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //Vytvorime si ArrayList typu(Objekt)Kniha kniznicaZoSuboru ,kde PRETIPUJEME Input Stream
            zoznamKnih = (ArrayList<Kniha>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Súbor bol načítaný");
            //vypisanie objektu ArrayList cez foreeach
            for (Kniha vystup : zoznamKnih) {
                System.out.println(vystup);
            }
        } catch (IOException e) {
            System.out.println("Nepodaril sa otvoriť súbor!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Súbor sa podarilo načítať, ale nie je kompatibilný s ArrayList!");
        }
    }

    public void StartMenu() {

        /* Alternativa
         * String vybrataMenuPolozka = "";
         * while(!vybrataMenuPolozka.toLowerCase().equals('koniec'){}
         */

        boolean ukoncitProgram = false; // premenna podmienky, ktora ukonci nekonecni cyklus while, ked uzivatel napise "koniec"

        do {
            String odpoved;
            int indexKnihy;
            Scanner scn = new Scanner(System.in);
            String vybrataMenuPolozka = scn.nextLine(); // ocakavame textovu hodnotu (zoberie aj cislo , ale ako text)

            //alternativa:String vybrataMenuPolozka = scn.nextLine().toLowerCase(); - Hneď prekonvertuje na male pismena

            switch (vybrataMenuPolozka.toLowerCase()) { // koverzia pouzivatelov text ma male pismena(kôly koniec).
                case "1":
                    zoznamKnih.add(pridajKnihu());
                    break;

                case "2":
                    if (!zoznamKnih.isEmpty()) {
                        System.out.println(" --- Celý zoznam knih --- ");
                        for (Kniha celyZoznam : zoznamKnih)
                            System.out.println("č." + (zoznamKnih.indexOf(celyZoznam) + 1) + "\t" + celyZoznam);
                    } else System.out.println("Zoznam kníh je prázdny");
                    break;

                case "3":
                    System.out.println("Zadaj číslo indexu knihy ktorú chceš vypísať ");
                    indexKnihy = scn.nextInt();
                    System.out.println(zoznamKnih.get(indexKnihy - 1));
                    break;

                case "4":
                    System.out.println("Zadaj číslo indexu knihy ktorú chceš vymazať ");
                    indexKnihy = scn.nextInt();
                    System.out.println("Si si istý, že chceš vymazať celý zoznam? Zadaj 'a' ak áno");
                    odpoved = scn.nextLine();

                    if (odpoved.equalsIgnoreCase("a"))
                        System.out.println("Vymazané \n" + zoznamKnih.remove(indexKnihy - 1));
                    break;

                case "5":
                    System.out.println("Veľkosť zoznamu knih je: " + zoznamKnih.size() + " záznamov.");
                    break;

                case "6":
                    hladajKnihyPodlaNazvu();
                    break;

                case "7":
                    nacitajZoSuboru();
                    break;

                case "8":
                    ulozDoSuboru();
                    break;

                case "9":
                    System.out.println("Si si istý, že chceš vymazať celý zoznam? Zadaj 'a' ak áno");
                    odpoved = scn.nextLine();

                    if (odpoved.equalsIgnoreCase("a")) zoznamKnih.clear();
                    System.out.println("Sú vymazané všetky knihy !");
                    break;


                case "koniec":
                    System.out.println("Si si istý, že chceš ukončiť program? Zadaj 'a' ak áno");
                    odpoved = scn.nextLine();

                    if (odpoved.equalsIgnoreCase("a")) ukoncitProgram = true;
                    System.out.println(" -----  Koniec progamu  ----- ");
                    break;

                default:
                    System.out.println("Nevybral si nic zo zoznamu");
            }
            if (!ukoncitProgram) {
                System.out.println("\n --- Zadaj opäť nejakú voľbu --- ");
                System.out.println("Chceš znovu zobraziť menu ? Zadaj 'a' ak áno ,alebo 'koniec' pre ukončenie' ");
                odpoved = scn.nextLine();

                if (odpoved.equalsIgnoreCase("a"))
                    zobrazMenu();
                else if (odpoved.equalsIgnoreCase("koniec")) {
                    ukoncitProgram = true;
                    System.out.println(" -----  Koniec progamu  ----- ");
                }
            }
        } while (!ukoncitProgram);
    }

}

