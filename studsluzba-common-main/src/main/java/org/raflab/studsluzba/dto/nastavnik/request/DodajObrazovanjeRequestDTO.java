package org.raflab.studsluzba.dto.nastavnik.request;

public class DodajObrazovanjeRequestDTO {
    private Long nastavnikId;
    private Long visokoskolskaUstanovaId;
    private String vrstaStudija;
    private String stecenoZvanje;
    private Integer godinaZavrsetka;

    public Long getNastavnikId() {
        return nastavnikId;
    }

    public void setNastavnikId(Long nastavnikId) {
        this.nastavnikId = nastavnikId;
    }

    public Long getVisokoskolskaUstanovaId() {
        return visokoskolskaUstanovaId;
    }

    public void setVisokoskolskaUstanovaId(Long visokoskolskaUstanovaId) {
        this.visokoskolskaUstanovaId = visokoskolskaUstanovaId;
    }

    public String getVrstaStudija() {
        return vrstaStudija;
    }

    public void setVrstaStudija(String vrstaStudija) {
        this.vrstaStudija = vrstaStudija;
    }

    public String getStecenoZvanje() {
        return stecenoZvanje;
    }

    public void setStecenoZvanje(String stecenoZvanje) {
        this.stecenoZvanje = stecenoZvanje;
    }

    public Integer getGodinaZavrsetka() {
        return godinaZavrsetka;
    }

    public void setGodinaZavrsetka(Integer godinaZavrsetka) {
        this.godinaZavrsetka = godinaZavrsetka;
    }
}