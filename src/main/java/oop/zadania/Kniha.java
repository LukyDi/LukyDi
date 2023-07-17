package oop.zadania;

import java.io.Serializable;

public class Kniha implements Serializable {
    // Atributy triedy, premenne triedy, fields

    private String nazov;
    private String autor;
    private String zaner;
    private int rokVydania;

    public Kniha(String nazov, String autor, int rokVydania) {
        this.nazov = nazov;
        this.autor = autor;
        this.rokVydania = rokVydania;
    }

    public Kniha(String nazov, String autor, String zaner) {
        this.nazov = nazov;
        this.autor = autor;
        this.zaner = zaner;
    }

    public Kniha() {
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getZaner() {
        return zaner;
    }

    public void setZaner(String zaner) {
        this.zaner = zaner;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    @Override
    public String toString() {
        return "{" +
               "nazov='" + nazov + '\'' +
               ", autor='" + autor + '\'' +
               ", zaner='" + zaner + '\'' +
               ", rokVydania=" + rokVydania +
               '}';
    }
}

