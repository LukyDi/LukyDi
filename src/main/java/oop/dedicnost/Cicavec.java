package oop.dedicnost;

public class Cicavec extends SuperCicavec {
    protected boolean jeDomace = false;

    public void sajeMlieko(){
        System.out.println("Saje mlieko");

    }

    public final void neprepisovatelnaMetoda(){ // kvôli final

        System.out.println("Tuto metodu nepojde zavolat ani vypisat v potomkovi");
    }

    private void nededitelnaMetoda(){ // kvôli private , nezobrazi ju ako moznosť.

    }
}
