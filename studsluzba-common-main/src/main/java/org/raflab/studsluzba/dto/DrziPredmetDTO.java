package org.raflab.studsluzba.dto;

public class DrziPredmetDTO {

    private Long id;
    private String nazivPredmeta;
    private String imeNastavnika;
    private String prezimeNastavnika;

    public DrziPredmetDTO(Long id, String nazivPredmeta, String imeNastavnika, String prezimeNastavnika) {
        this.id = id;
        this.nazivPredmeta = nazivPredmeta;
        this.imeNastavnika = imeNastavnika;
        this.prezimeNastavnika = prezimeNastavnika;
    }

    public DrziPredmetDTO() {
    }

    public String getPrezimeNastavnika() {
        return prezimeNastavnika;
    }

    public void setPrezimeNastavnika(String prezimeNastavnika) {
        this.prezimeNastavnika = prezimeNastavnika;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public String getImeNastavnika() {
        return imeNastavnika;
    }
    public void setImeNastavnika(String imeNastavnika) {
        this.imeNastavnika = imeNastavnika;
    }

    @Override
    public String toString() {
        return nazivPredmeta + " - " + imeNastavnika;
    }
}
