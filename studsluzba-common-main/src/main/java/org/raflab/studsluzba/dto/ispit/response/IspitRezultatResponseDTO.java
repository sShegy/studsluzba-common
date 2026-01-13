package org.raflab.studsluzba.dto.ispit.response;

public class IspitRezultatResponseDTO {
    private String studentImePrezime;
    private String brojIndeksa;
    private Double poeniPredispitne;
    private Double poeniIspit;
    private Double ukupnoPoena;
    private Integer ocena;
    private boolean polozio;

    public String getStudentImePrezime() {
        return studentImePrezime;
    }

    public void setStudentImePrezime(String studentImePrezime) {
        this.studentImePrezime = studentImePrezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public Double getPoeniPredispitne() {
        return poeniPredispitne;
    }

    public void setPoeniPredispitne(Double poeniPredispitne) {
        this.poeniPredispitne = poeniPredispitne;
    }

    public Double getPoeniIspit() {
        return poeniIspit;
    }

    public void setPoeniIspit(Double poeniIspit) {
        this.poeniIspit = poeniIspit;
    }

    public Double getUkupnoPoena() {
        return ukupnoPoena;
    }

    public void setUkupnoPoena(Double ukupnoPoena) {
        this.ukupnoPoena = ukupnoPoena;
    }

    public Integer getOcena() {
        return ocena;
    }

    public void setOcena(Integer ocena) {
        this.ocena = ocena;
    }

    public boolean isPolozio() {
        return polozio;
    }

    public void setPolozio(boolean polozio) {
        this.polozio = polozio;
    }

    public void preracunajSve() {
        double predispitni = (poeniPredispitne != null) ? poeniPredispitne : 0.0;
        double ispit = (poeniIspit != null) ? poeniIspit : 0.0;

        this.ukupnoPoena = predispitni + ispit;

        if (this.ukupnoPoena >= 91) this.ocena = 10;
        else if (this.ukupnoPoena >= 81) this.ocena = 9;
        else if (this.ukupnoPoena >= 71) this.ocena = 8;
        else if (this.ukupnoPoena >= 61) this.ocena = 7;
        else if (this.ukupnoPoena >= 51) this.ocena = 6;
        else this.ocena = 5;

        this.polozio = (this.ocena > 5);
    }
}