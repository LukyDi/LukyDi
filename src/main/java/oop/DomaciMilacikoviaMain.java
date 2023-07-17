package oop;


//Úloha č. 1:
// Opakovanie na tvorbu triedy s využitím enkapsulácie, čiže modelu a triedy, v
// ktorej budeme objekty vytvárať a následne vypisovať. Úloha môže byť zameraná na: Domáci miláčikovia.Max 3 atribúty

public class DomaciMilacikoviaMain {
    public static void main(String[] args) {

        DomaciMilacik pes = new DomaciMilacik("Pes", "čierno-biely", 5);
        DomaciMilacik macka = new DomaciMilacik("Mačka", "Ryšavá", 1);
        DomaciMilacik skrecok = new DomaciMilacik("Škrečok", "Biela", 2);

        System.out.println("Vypis objektu :" + pes.getDruh());
        System.out.println(pes);

        System.out.println("Vypis objektu :" + macka.getDruh());
        System.out.println(macka);

        System.out.println("Vypis objektu :" + skrecok.getDruh());
        System.out.println(skrecok);


    }

}
