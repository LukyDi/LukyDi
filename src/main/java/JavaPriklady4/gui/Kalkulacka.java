package JavaPriklady4.gui;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;

public class Kalkulacka {
    public static void main(String[] args) {
       /* try {
            NimbusLookAndFeel nimbusLookAndFeel = new NimbusLookAndFeel();
            UIManager.setLookAndFeel(nimbusLookAndFeel);
            nimbusLookAndFeel.getDefaults().put("defaultFont", new Font("Arial", Font.PLAIN, 24));
        } catch (Exception e){
        System.err.println("Nimbus is not aviable");
    }*/


        // TODO Nastaviť jednotne vhľad aplikácie pre rôzne OS
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); //alebo .getSystemLookAndFeelClassName
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame hlavneOkno = new JFrame("Kalkulačka v1.0");
        hlavneOkno.setMinimumSize(new Dimension(500, 400));
        //TODO ako nastaviť okno maximalizované po spustení aplikácie
        //hlavneOkno.setResizable(false); // zakázať možnosť zmeny displeja

        hlavneOkno.setLocationRelativeTo(null);// vycentrujeme JFrame voci obrazovke horizontalne aj vertikalne
        hlavneOkno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // ak zavrieme okno ,ukončí program!
        // pokracujeme  vytvarenim panela
        JPanel panel = new JPanel();
        panel.setLayout(null); // panel bude bez akehokolvek Layout-u

        hlavneOkno.setContentPane(panel); // do okna , teda JFrame tymto spôsobom pridávame panel
        //pokraceujeme vytvorenim textoveho pola, kde môže používateľ písať
        JTextField vstupneOkno = new JTextField();
        vstupneOkno.setBounds(20, 40, 460, 20); // nastavili sme rozmeri textoveho pola
        vstupneOkno.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(vstupneOkno);

        //vytvorenie tlacidla s oznacenim 0 // 
       /*  TODO ako vyriesit problem so zobrazovanim viacerych 0, ked su zobrazovane za sebou alebo samostantne 00
        1.kokretny priklad = 12+0
        Riesenie: Budeme testovat posledne dva znaky a ak obsahuju +0 alebo -0 alebo *0 alebo /0 tak dalsiu 0 nevypise
        dovolim vypisat iba desatinu bodku alebo dalsie znamienka, prip. rovna sa alebo C(clear)
        2.kokretny priklad :
         Riesenie: Budeme testovat ci zadany text ma dlzku jedneho znaku a zaroven ak obsahuje 0, tak dovolim vypisat
        bodku alebo dalsie znamienka
        */


        JButton tlacidlo0 = new JButton("0");  // vytvorili sme tlacidlo s oznacenim 0

        tlacidlo0.setBounds(20, 300, 60, 50);// Umiestnili sme ho na urcitu poziciu a nastavli vysku,sirku

        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidlo0.addActionListener(e -> {
            //vstupneOkno.setText(vstupneOkno.getText() + "0");
            String zadanyVzorec = vstupneOkno.getText();
            String posledne2znakyZadanehoVzorca = KalkulackaServis.ziskajPosledne2znaky(zadanyVzorec);

            KalkulackaServis.vypisHodnotu(vstupneOkno, "0");

        });

        //vytvorenie tlacidla s oznacenim 1
        JButton tlacidlo1 = new JButton("1");  // vytvorili sme tlacidlo s oznacenim 0
        tlacidlo1.setBounds(20, 240, 60, 50); // Umiestnili sme ho na urcitu poziciu a nastavli vysku,sirku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidlo1.addActionListener(e -> {
            String zadanyVzorec = vstupneOkno.getText();
            String posledne2znakyZadanehoVzorca = KalkulackaServis.ziskajPosledne2znaky(zadanyVzorec);

            KalkulackaServis.vypisHodnotu(vstupneOkno, "1");
        });

        //TODO Vytvorme tlacidla pre zvysne cisla; vypoctove operatory ako su + - ; rovna sa = pre vypocet; C(CE) pre vymazanie

        //vytvorenie tlacidla s oznacenim 2
        JButton tlacidlo2 = new JButton("2");  // vytvorili sme tlacidlo s oznacenim 0
        tlacidlo2.setBounds(90, 240, 60, 50); // Umiestnili sme ho na urcitu poziciu a nastavli vysku,sirku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidlo2.addActionListener(e -> {
            String zadanyVzorec = vstupneOkno.getText();
            String posledne2znakyZadanehoVzorca = KalkulackaServis.ziskajPosledne2znaky(zadanyVzorec);

            KalkulackaServis.vypisHodnotu(vstupneOkno, "2");
        });

        //TODO vymysliet aby nepisalo za sebou plusy a minusy do textu (+++;---) alebo iba jedno.

        //vytvorenie tlacidla s oznacenim +
        JButton tlacidloPlus = new JButton("+");  // vytvorili sme tlacidlo s oznacenim 0
        tlacidloPlus.setBounds(290, 240, 60, 50); // Umiestnili sme ho na urcitu poziciu a nastavli vysku,sirku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidloPlus.addActionListener(e -> vstupneOkno.setText(vstupneOkno.getText() + "+"));

        //vytvorenie tlacidla s oznacenim -
        JButton tlacidloMinus = new JButton("-");  // vytvorili sme tlacidlo s oznacenim 0
        tlacidloMinus.setBounds(320, 240, 60, 50); // Umiestnili sme ho na urcitu poziciu a nastavli vysku,sirku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidloMinus.addActionListener(e -> vstupneOkno.setText(vstupneOkno.getText() + "-"));

        //vytvorenie tlacidla s oznacenim C (pre vymazanie obsahu vstupneho okna)
        JButton tlacidloC = new JButton("C");  // vytvorili sme tlacidlo s oznacenim 0
        tlacidloC.setBounds(390, 240, 60, 50); // Umiestnili sme ho na urcitu poziciu a nastavli vysku,sirku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo
        tlacidloC.addActionListener(e -> {
            vstupneOkno.setText(""); // prepise obsah na "prazdny"
        });

        //vytvorenie tlacidla s oznacenim = (pre vypocet zadaneho textu)
        JButton tlacidloRovnaSa = new JButton("=");  // vytvorili sme tlacidlo s oznacenim 0
        tlacidloRovnaSa.setBounds(440, 240, 60, 100); // Umiestnili sme ho na urcitu poziciu a nastavli vysku,sirku
        // Pridavame moznost interaktivity, cize programujeme reakciu na kliknutie na tlacidlo

        tlacidloRovnaSa.addActionListener(e -> {
            ScriptEngineManager factory = new ScriptEngineManager();
            ScriptEngine engine = factory.getEngineByName("nashorn");
            String vzorec = vstupneOkno.getText();
            try {
                vstupneOkno.setText(engine.eval(vzorec).toString());// vysledok Stringu,ktory obsahuje vzorec vypisem
            } catch (ScriptException e1) {
                throw new RuntimeException(e1);
            }
        });

        //Pridavame tlacidla do JPanel
        panel.add(tlacidlo0);
        panel.add(tlacidlo1);
        panel.add(tlacidlo2);
        panel.add(tlacidloPlus);
        panel.add(tlacidloMinus);
        panel.add(tlacidloC);
        panel.add(tlacidloRovnaSa);


        //pre korektne zobrazenie okna, cize JFrame využijeme tieto dva priklady
        hlavneOkno.pack();
        hlavneOkno.setVisible(true);
    }
}
