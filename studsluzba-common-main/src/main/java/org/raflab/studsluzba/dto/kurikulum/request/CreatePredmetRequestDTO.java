package org.raflab.studsluzba.dto.kurikulum.request;

public class CreatePredmetRequestDTO {
    private String sifra;
    private String naziv;
    private String opis;
    private Integer espb;
    private Integer semestar;
    private boolean obavezan;
    private Long studijskiProgramId;
    private Integer fondPredavanja;
    private Integer fondVezbe;


//    public CreatePredmetRequestDTO(Long studijskiProgramId, String sifra, String naziv, Integer espb, Integer semestar) {
//        this.studijskiProgramId = studijskiProgramId;
//        this.sifra = sifra;
//        this.naziv = naziv;
//        this.espb = espb;
//        this.semestar = semestar;
//    }

    public CreatePredmetRequestDTO(Long studijskiProgramId, String sifra, String naziv, Integer espb, Integer semestar, Integer fondPredavanja, Integer fondVezbe, String opis, boolean obavezan) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.opis = opis;
        this.espb = espb;
        this.semestar = semestar;
        this.obavezan = obavezan;
        this.studijskiProgramId = studijskiProgramId;
        this.fondPredavanja = fondPredavanja;
        this.fondVezbe = fondVezbe;
    }

    public CreatePredmetRequestDTO() {
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

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
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

    public boolean isObavezan() {
        return obavezan;
    }

    public void setObavezan(boolean obavezan) {
        this.obavezan = obavezan;
    }

    public Long getStudijskiProgramId() {
        return studijskiProgramId;
    }

    public void setStudijskiProgramId(Long studijskiProgramId) {
        this.studijskiProgramId = studijskiProgramId;
    }

    public Integer getFondPredavanja() {
        return fondPredavanja;
    }

    public void setFondPredavanja(Integer fondPredavanja) {
        this.fondPredavanja = fondPredavanja;
    }

    public Integer getFondVezbe() {
        return fondVezbe;
    }

    public void setFondVezbe(Integer fondVezbe) {
        this.fondVezbe = fondVezbe;
    }
}