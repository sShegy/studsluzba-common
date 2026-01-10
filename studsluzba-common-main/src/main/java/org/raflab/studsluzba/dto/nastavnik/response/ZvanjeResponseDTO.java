package org.raflab.studsluzba.dto.nastavnik.response;

import java.time.LocalDate;

public class ZvanjeResponseDTO {
    private String zvanje;
    private LocalDate datumIzbora;
    private String naucnaOblast;

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    public LocalDate getDatumIzbora() {
        return datumIzbora;
    }

    public void setDatumIzbora(LocalDate datumIzbora) {
        this.datumIzbora = datumIzbora;
    }

    public String getNaucnaOblast() {
        return naucnaOblast;
    }

    public void setNaucnaOblast(String naucnaOblast) {
        this.naucnaOblast = naucnaOblast;
    }

    @Override
    public String toString() {
        return zvanje + " (" + naucnaOblast + ")";
    }
}