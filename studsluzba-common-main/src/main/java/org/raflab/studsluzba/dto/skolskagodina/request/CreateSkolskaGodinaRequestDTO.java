package org.raflab.studsluzba.dto.skolskagodina.request;

public class CreateSkolskaGodinaRequestDTO {
    private String naziv; // npr. "2025/2026"
    private boolean aktivna;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public boolean isAktivna() {
        return aktivna;
    }

    public void setAktivna(boolean aktivna) {
        this.aktivna = aktivna;
    }
}