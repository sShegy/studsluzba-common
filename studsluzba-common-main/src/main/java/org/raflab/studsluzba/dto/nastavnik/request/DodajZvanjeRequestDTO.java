package org.raflab.studsluzba.dto.nastavnik.request;

import java.time.LocalDate;

public class DodajZvanjeRequestDTO {
    private Long nastavnikId;
    private String zvanje; // npr. "Docent", "Vanredni profesor"
    private LocalDate datumIzbora;
    private String naucnaOblast;

    public Long getNastavnikId() {
        return nastavnikId;
    }

    public void setNastavnikId(Long nastavnikId) {
        this.nastavnikId = nastavnikId;
    }

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
}