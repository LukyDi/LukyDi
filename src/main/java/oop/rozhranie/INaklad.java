package oop.rozhranie;

public interface INaklad { // nepoužívajú sa premenné!! žiadne atribúty , nepouziva sa ani konstanty.
   
    void vypis();
    void vytlac();
    void zoznamNakladov();
    double celkoveNaklad();
    void exportDoPDF();
}
