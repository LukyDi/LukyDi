package oop.polymorfizmus;


import oop.polymorfizmus.model.Kon;
import oop.polymorfizmus.model.Macka;
import oop.polymorfizmus.model.Pes;
import oop.polymorfizmus.model.Zviera;

import java.util.ArrayList;
import java.util.List;


public class DomaceZvierataMain {
    public static void main(String[] args) {
        List<Zviera> zvierata = new ArrayList<>();
        zvierata.add(new Pes("Dunčo", 50));
        zvierata.add(new Macka("Cica", 5));
        zvierata.add(new Kon("Jonatán", 10));
        zvierata.add(new Kon("Lord", 40));

        for (Zviera zviera: zvierata) {
            zviera.ozyvasa();
        }
    }
}
