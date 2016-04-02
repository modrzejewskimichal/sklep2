package com.company;

/**
 * Created by User on 2016-03-20.
 */
public class Pozycja {
    protected String nazwaTowaru;
    protected int ileSztuk;
    protected double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }
    public double obliczWartosc(){
        return cena*ileSztuk;
    }

    @Override
    public String toString() {
        String lancuch = String.format("%s%20s%2s%4s%2s%10s%2s",nazwaTowaru,cena,"zl",ileSztuk,"szt.",obliczWartosc(),"zl");
        return lancuch;
    }
}