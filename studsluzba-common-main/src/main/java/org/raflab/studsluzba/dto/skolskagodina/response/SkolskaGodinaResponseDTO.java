package org.raflab.studsluzba.dto.skolskagodina.response;

public class SkolskaGodinaResponseDTO {
    private Long id;
    private String naziv;
    private boolean aktivna;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return naziv; // Ovo osigurava da se u meniju ispiše samo npr. "2024/2025"
    }
}