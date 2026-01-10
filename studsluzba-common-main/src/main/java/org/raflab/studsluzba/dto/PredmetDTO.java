package org.raflab.studsluzba.dto;

public class PredmetDTO {
    private Long id;
    private String sifra;
    private String naziv;
    private Integer espb;
    private Integer semestar;
    private Double prosek;

    public PredmetDTO(Long id, String sifra, String naziv, Integer espb, Integer semestar) {
        this.id = id;
        this.sifra = sifra;
        this.naziv = naziv;
        this.espb = espb;
        this.semestar = semestar;
    }
    public PredmetDTO() {
    }

    public Double getProsek() {
        return prosek;
    }
    public void setProsek(Double prosek) {
        this.prosek = prosek;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getEspb() {
        return espb;
    }

    public void setEspb(Integer espb) {
        this.espb = espb;
    }

    public Integer getSemestar() {
        return semestar;
    }

    public void setSemestar(Integer semestar) {
        this.semestar = semestar;
    }

    @Override
    public String toString() {
        return naziv;
    }
}