package org.raflab.studsluzba.dto.ispit.response;

import java.time.LocalDate;
import java.util.List;

public class IspitniRokResponseDTO {
    private Long id;
    private String naziv;
    private LocalDate datumPocetka;
    private LocalDate datumZavrsetka;
    private List<IspitResponseDTO> ispiti;

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

    public LocalDate getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(LocalDate datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public LocalDate getDatumZavrsetka() {
        return datumZavrsetka;
    }

    public void setDatumZavrsetka(LocalDate datumZavrsetka) {
        this.datumZavrsetka = datumZavrsetka;
    }

    public List<IspitResponseDTO> getIspiti() {
        return ispiti;
    }

    public void setIspiti(List<IspitResponseDTO> ispiti) {
        this.ispiti = ispiti;
    }

    @Override
    public String toString() {
        return naziv;
    }
}