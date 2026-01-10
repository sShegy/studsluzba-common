package org.raflab.studsluzba.dto.kurikulum.response;

public class PredispitnaObavezaResponseDTO {
    private Long id;
    private String vrsta;
    private Double maxPoena;
    private String skolskaGodina;
    private Double osvojeniPoeni;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public Double getMaxPoena() {
        return maxPoena;
    }

    public void setMaxPoena(Double maxPoena) {
        this.maxPoena = maxPoena;
    }

    public String getSkolskaGodina() {
        return skolskaGodina;
    }

    public void setSkolskaGodina(String skolskaGodina) {
        this.skolskaGodina = skolskaGodina;
    }

    public Double getOsvojeniPoeni() {
        return osvojeniPoeni;
    }

    public void setOsvojeniPoeni(Double osvojeniPoeni) {
        this.osvojeniPoeni = osvojeniPoeni;
    }
}