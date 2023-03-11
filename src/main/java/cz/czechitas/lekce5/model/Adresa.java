package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Adresa {
    private String ulice;
    private String castObce;
    private String obec;
    private String psc;


    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        Objects.requireNonNull(ulice);
        if (ulice.isBlank()) {
            System.err.println("Ulice nesmi byt prazdna.");
            return;
        }
        this.ulice = ulice;
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        Objects.requireNonNull(obec);
        if (obec.isBlank()) {
            System.err.println("Obec nesmi byt prazdna.");
            return;
        }
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        Objects.requireNonNull(psc);
        if (psc.isBlank()) {
            System.err.println("PSC nesmi byt prazdne.");
            return;
        }
        this.psc = psc;
    }



    @Override
    public String toString() {
        return "Adresa{" +
                "ulice='" + ulice + '\'' +
                ", castObce='" + castObce + '\'' +
                ", obec='" + obec + '\'' +
                ", psc='" + psc + '\'' +
                '}';
    }
}


