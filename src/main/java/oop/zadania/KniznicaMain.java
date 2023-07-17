package oop.zadania;
/*
Opakovanie: OOP

Úloha č.2
        Vytvorte knižnicu (KniznicaMain), kde bude môcť používateľ zadať knihy (názov, autor, rok vydania) cez konzolu
        kým nezadá slovo quit. Tie na konci vypíšeme. Opakovanie na ArrayList.

                        Menu s možnosťami
            Zadaj novú knihu
            Zobraz všetky knihy
            Zobraz konkrétnu knihu (podľa indexu)
            Vymaž konkrétnu knihu (podľa indexu)
            Zobraz počet všetkých kníh
            Vyhľadaj knihu podľa názvu
            Načítaj zoznam kníh zo súboru (zadaj názov súboru)
            Ulož zoznam kníh do súboru (zadaj názov súboru)
            Uprav knihu
            Vymaž všetky knihy
            Export do PDF
            Koniec = koniec aplikácie


        Pomôcky
        Na zistenie počtu záznamov (kníh) použijeme metódu ArrayList.size();

        Na získanie konkrétneho záznamu z ArrayList použijeme metódu ArrayList.get(index);

        Na odstránenie konkrétneho záznamu z ArrayList použijeme metódu ArrayList.remove(index);

        Vyhľadaj knihu podľa názvu knihy, resp. zisti či daná kniha v zozname existuje alebo nie
        (pozor je to len kontrola jedného údaju!):

        public static List<String> findUsingLoop(String search, List<String> list) {
        List<String> matches = new ArrayList<String>();
        for(String str: list) {
        if (str.contains(search)) {
        matches.add(str);
        }
        }
        return matches;
        }
        Zdroj: https://www.baeldung.com/java-search-string-arraylist
        Bonusová úloha: Doplňte fulltextové vyhľadávanie podľa názvu knihy, príp. autora. Jedná sa o metódu contains,
        viď príklad vyššie, takže riešenie je už uvedené 🙂.
        Bonusová úloha č. 2: Vytvorte možnosť exportu zoznamu kníh do PDF
        Bonusová úloha č. 3: Možnosť uložiť zoznam kníh do súboru a znovu ich načítať. Využite serializáciu a
        deserializáciu objektov.

        čast kódu od Ján Kavan ->
                databazaKnih
                .stream()
                .filter(kniha -> kniha.getNazov().contains(hladanyText)
                        || kniha.getAutor().contains(hladanyText))
                .collect(Collectors.toList());
------------------------------------------------------------------------------------------------------------------------
                            Vytvorenie PDF súboru a zápis do neho
                        Ukážka zdrojového kódu
                        import java.io.FileNotFoundException;
                        import java.io.FileOutputStream;
                        import com.itextpdf.text.Document;
                        import com.itextpdf.text.DocumentException;
                        import com.itextpdf.text.Paragraph;
                        import com.itextpdf.text.pdf.PdfWriter;


public class JavaPdfHelloWorld {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
            document.open();
            document.add(new Paragraph("A Hello World PDF document."));
            document.close();
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
*/


import java.io.FileNotFoundException;
import java.io.IOException;

public class KniznicaMain {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Ak chceme vyuzivat nestaticke metody, teda tie, v ktorych nie je napisane slovo static, tak musime najprv
        //vytvorit objekt

        KniznicaService kniznicaService = new KniznicaService();
        //Inicializovaný  objekt je zároveň naplnený knihami , prázdnym konštruktorom KniznicaService

        //Zobrazujeme menu
        kniznicaService.zobrazMenu();

        //Rozhodovanie co sme si vybrali metoda pracaZKniznicou
        kniznicaService.StartMenu();
    }

}
