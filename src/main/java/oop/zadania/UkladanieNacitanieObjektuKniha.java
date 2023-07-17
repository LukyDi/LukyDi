package oop.zadania;

import java.io.*;
import java.util.ArrayList;

public class UkladanieNacitanieObjektuKniha {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Kniha knihaObjekt1 = new Kniha();
        knihaObjekt1.setAutor("Amma Schoon");
        knihaObjekt1.setNazov("Motýľ");
        knihaObjekt1.setZaner("Ženský román");

        Kniha knihaObjekt2 = new Kniha();
        knihaObjekt2.setAutor("Duna");
        knihaObjekt2.setNazov("Frank Herbert");
        knihaObjekt2.setZaner("SCI-FI");

        ArrayList<Kniha> kniznica = new ArrayList<>();
        kniznica.add(knihaObjekt1); // ukladame knihaObjekt1 , cize prvu knihu
        kniznica.add(knihaObjekt2); // ukladame knihaObjekt1 , cize prvu knihu

        FileOutputStream fileOutputStream = new FileOutputStream("kniznica.databaza");
        // vytvorime subor s nazvom kniha.ser(ser ako serialize)
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        // vytvorime Objekt stream pre ukladanie objektov

        //ukladanie objektov
        objectOutputStream.writeObject(kniznica); // zapiseme objekt
        objectOutputStream.flush(); // realne uskustocnime operaciu zapisu
        objectOutputStream.close(); // zatvorime objekt output stream
        fileOutputStream.close(); // zatvorime file output stream , cize subor

        // nacitanie ArrayList
        FileInputStream fileInputStream = new FileInputStream("kniznica.databaza");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //Vytvorime si ArrayList typu(Objekt)Kniha kniznicaZoSuboru ,kde PRETIPUJEME Input Stream
        ArrayList<Kniha> kniznicaZoSuboru = (ArrayList) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        //vypisanie objektu ArrayList cez foreeach
        for (Kniha vystup : kniznicaZoSuboru){
            System.out.println(vystup);
        }

    }
}
