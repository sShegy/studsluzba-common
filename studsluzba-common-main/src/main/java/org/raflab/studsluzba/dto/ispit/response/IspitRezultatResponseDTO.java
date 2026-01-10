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
}