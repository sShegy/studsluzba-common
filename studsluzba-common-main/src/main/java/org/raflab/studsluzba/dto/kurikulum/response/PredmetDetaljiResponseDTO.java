package org.raflab.studsluzba.dto.kurikulum.response;

import org.raflab.studsluzba.dto.NastavnikOsnovnoDTO;

import java.util.List;

public class PredmetDetaljiResponseDTO {
    private Long id;
    private String sifra;
    private String naziv;
    private String opis;
    private Integer espb;
    private Integer semestar;
    private List<NastavnikOsnovnoDTO> nastavnici;

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

    public List<NastavnikOsnovnoDTO> getNastavnici() {
        return nastavnici;
    }

    public void setNastavnici(List<NastavnikOsnovnoDTO> nastavnici) {
        this.nastavnici = nastavnici;
    }
}