package org.raflab.studsluzba.dto.ispit.response;

import org.raflab.studsluzba.dto.NastavnikOsnovnoDTO;
import org.raflab.studsluzba.dto.PredmetDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class IspitResponseDTO {
    private Long id;
    private PredmetDTO predmet;
    private NastavnikOsnovnoDTO nastavnik;
    private LocalDate datumOdrzavanja;
    private LocalTime vremePocetka;
    private boolean zakljucen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PredmetDTO getPredmet() {
        return predmet;
    }

    public void setPredmet(PredmetDTO predmet) {
        this.predmet = predmet;
    }

    public NastavnikOsnovnoDTO getNastavnik() {
        return nastavnik;
    }

    public void setNastavnik(NastavnikOsnovnoDTO nastavnik) {
        this.nastavnik = nastavnik;
    }

    public LocalDate getDatumOdrzavanja() {
        return datumOdrzavanja;
    }

    public void setDatumOdrzavanja(LocalDate datumOdrzavanja) {
        this.datumOdrzavanja = datumOdrzavanja;
    }

    public LocalTime getVremePocetka() {
        return vremePocetka;
    }

    public void setVremePocetka(LocalTime vremePocetka) {
        this.vremePocetka = vremePocetka;
    }

    public boolean isZakljucen() {
        return zakljucen;
    }

    public void setZakljucen(boolean zakljucen) {
        this.zakljucen = zakljucen;
    }
}