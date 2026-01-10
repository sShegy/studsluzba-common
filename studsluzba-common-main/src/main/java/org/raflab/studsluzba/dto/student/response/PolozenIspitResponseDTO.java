package org.raflab.studsluzba.dto.student.response;

import java.time.LocalDate;

public class PolozenIspitResponseDTO {
    private String sifraPredmeta;
    private String nazivPredmeta;
    private Integer ocena;
    private Integer espb;
    private LocalDate datumPolaganja;
    private Integer godinaStudija;

    public String getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(String sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public Integer getOcena() {
        return ocena;
    }

    public void setOcena(Integer ocena) {
        this.ocena = ocena;
    }

    public Integer getEspb() {
        return espb;
    }

    public void setEspb(Integer espb) {
        this.espb = espb;
    }

    public LocalDate getDatumPolaganja() {
        return datumPolaganja;
    }

    public void setDatumPolaganja(LocalDate datumPolaganja) {
        this.datumPolaganja = datumPolaganja;
    }

    public Integer getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(Integer godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
}