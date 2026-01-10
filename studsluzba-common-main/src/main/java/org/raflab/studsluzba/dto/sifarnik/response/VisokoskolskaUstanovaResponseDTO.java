package org.raflab.studsluzba.dto.sifarnik.response;

public class VisokoskolskaUstanovaResponseDTO {
    private Long id;
    private String naziv;
    private String mesto;
    private String skracenaOznaka;

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

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getSkracenaOznaka() {
        return skracenaOznaka;
    }

    public void setSkracenaOznaka(String skracenaOznaka) {
        this.skracenaOznaka = skracenaOznaka;
    }
}