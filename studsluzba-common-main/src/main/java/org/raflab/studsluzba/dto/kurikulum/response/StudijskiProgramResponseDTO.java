package org.raflab.studsluzba.dto.kurikulum.response;

import org.raflab.studsluzba.dto.PredmetDTO;

import java.util.List;

public class StudijskiProgramResponseDTO {
    private Long id;
    private String oznaka;
    private String naziv;

    private Integer godinaAkreditacije;
    private String nazivZvanja;
    private Integer trajanjeSemestra;

    private List<PredmetDTO> predmeti;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getGodinaAkreditacije() {
        return godinaAkreditacije;
    }

    public void setGodinaAkreditacije(Integer godinaAkreditacije) {
        this.godinaAkreditacije = godinaAkreditacije;
    }

    public String getNazivZvanja() {
        return nazivZvanja;
    }

    public void setNazivZvanja(String nazivZvanja) {
        this.nazivZvanja = nazivZvanja;
    }

    public Integer getTrajanjeSemestra() {
        return trajanjeSemestra;
    }

    public void setTrajanjeSemestra(Integer trajanjeSemestra) {
        this.trajanjeSemestra = trajanjeSemestra;
    }

    public List<PredmetDTO> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<PredmetDTO> predmeti) {
        this.predmeti = predmeti;
    }
}