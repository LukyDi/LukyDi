package oop.dedicnost;

public class DomaceZvierata {

    public static void main(String[] args) {
        Pes dunco = new Pes();
        dunco.sajeMlieko();
        dunco.jeDomace = true;
        dunco.lietaDoVesmiru();// dedí z triedy Cicavec , ktorá dedí z triedy SuperCicavec

        Macka cica = new Macka();
        cica.sajeMlieko();
        cica.jeDomace = true;

    }
}
