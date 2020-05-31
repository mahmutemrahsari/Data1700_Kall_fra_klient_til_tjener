package com.example.demo;

public class Kunde {
    String navn;
    String adresse;
    public Kunde(String navn, String adresse){
        this.navn=navn;
        this.adresse = adresse;
    }

    public Kunde(){}

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
