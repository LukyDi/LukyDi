package JavaPriklady4.gui;

import javax.swing.*;

public class KalkulackaServis {

    public static boolean jeCisloPovolene(String posledne2znakyZadanehoVzorca) {

        if (!(posledne2znakyZadanehoVzorca.equals("+0")) || posledne2znakyZadanehoVzorca.equals("-0")) {
            return true;
        } else
            return false;
    }

    public static String ziskajPosledne2znaky(String text) {

        //Ako sa vyvarovat chybe, ked mame prazdny text,alebo text obsahuje 1 znak vyriesene

        if (text.length() > 1)
            return text.substring(text.length() - 2);
        else
            return "";
    }

    public static boolean jeNaZaciatkuNula(String text) {

        if (!((text.length() == 1) && (text.equals("0"))))
            return true;
        else
            return false;
    }

    public static void vypisHodnotu(JTextField vstupneOkno, String hodnota) {
        if (!jeNaZaciatkuNula(vstupneOkno.getText())) {
            if (jeCisloPovolene(ziskajPosledne2znaky(vstupneOkno.getText()))) {
                vstupneOkno.setText(vstupneOkno.getText() + hodnota);
            } else vstupneOkno.setText(vstupneOkno.getText().substring(0, vstupneOkno.getText().length() - 1) + hodnota);
        } else
            vstupneOkno.setText(vstupneOkno.getText().substring(0, vstupneOkno.getText().length() - 1) + hodnota);
    }


}
